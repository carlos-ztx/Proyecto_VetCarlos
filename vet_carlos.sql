-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-08-2023 a las 01:47:52
-- Versión del servidor: 10.1.10-MariaDB
-- Versión de PHP: 7.0.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vet_carlos`
--
CREATE DATABASE IF NOT EXISTS `vet_carlos` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `vet_carlos`;

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizarDueno` (IN `nombre_` VARCHAR(45), IN `telefono_` VARCHAR(12), IN `cedula_` VARCHAR(10), IN `id_` INT)  NO SQL
UPDATE dueno SET nombre = nombre_, telefono = telefono_, cedula = cedula_ WHERE id_dueno = id_$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizarEstatusServicioI` (IN `id_` INT)  NO SQL
UPDATE servicio SET estatus = 0 WHERE id_servicio = id_$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizarMascota` (IN `nombre_` VARCHAR(45), IN `raza_` VARCHAR(45), IN `color_` VARCHAR(45), IN `fk_dueno` INT, IN `id_` INT)  NO SQL
UPDATE mascotas SET nombre = nombre_, raza = raza_, color = color_, fk_id_dueno = fk_dueno WHERE id_mascota = id_$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizarServicio` (IN `servicio_` ENUM('Consulta','Peluqueria','Cirugía'), IN `alergia_` ENUM('SI','NO'), IN `fecha_` DATE, IN `observaciones_` VARCHAR(255), IN `fk_` INT, IN `pk_` INT)  NO SQL
UPDATE servicio SET tipo_servicio = servicio_, alergia = alergia_, fecha_programada = fecha_, observaciones = observaciones_, fk_id_mascota = fk_ WHERE id_servicio = pk_$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `crearDueno` (IN `nombre_` VARCHAR(45), IN `telefono_` VARCHAR(12), IN `cedula_` VARCHAR(10))  NO SQL
INSERT INTO dueno (nombre, telefono, cedula) VALUES (nombre_, telefono_, cedula_)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `crearMascota` (IN `nombre_` VARCHAR(45), IN `raza_` VARCHAR(45), IN `color_` VARCHAR(45), IN `fk_dueno` INT)  NO SQL
INSERT INTO mascotas (nombre, raza, color, fk_id_dueno) VALUES (nombre_, raza_, color_, fk_dueno)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `crearServicio` (IN `servicio_` ENUM('Consulta','Peluqueria','Cirugía'), IN `alergia_` ENUM('SI','NO'), IN `fecha_` DATE, IN `observaciones_` VARCHAR(255), IN `fk_` INT)  NO SQL
INSERT INTO servicio (tipo_servicio, alergia, fecha_programada, observaciones, fk_id_mascota) VALUES (servicio_, alergia_, fecha_, observaciones_, fk_)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarDueno` (IN `id` INT)  NO SQL
DELETE FROM dueno WHERE id_dueno = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getDuenoID` (IN `cedula_` VARCHAR(10))  NO SQL
SELECT id_dueno FROM dueno where cedula = cedula_$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `leerDueno` ()  NO SQL
SELECT * FROM dueno$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `leerHistorialServicio` ()  NO SQL
SELECT tipo_servicio, alergia, fecha_programada, observaciones, estatus, fk_id_servicio, fecha_registro FROM historial_servicios$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `leerMascota` ()  NO SQL
SELECT id_mascota, m.nombre, raza, color, CONCAT(d.nombre,", ",d.cedula) FROM mascotas m INNER JOIN dueno d ON m.fk_id_dueno = d.id_dueno$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `leerServicioA` ()  NO SQL
SELECT * FROM vista_serviciosa$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `leerServicioI` ()  NO SQL
SELECT * FROM vista_serviciosi$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `obtenerIdDelUsuario` (`user_` VARCHAR(50))  SELECT id_usuario FROM usuarios where user = user_$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `recuperarClave` (`correo_` VARCHAR(100))  SELECT clave FROM usuarios where correo = correo_$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `rellenarComboDueño` ()  NO SQL
SELECT nombre, cedula FROM dueno ORDER BY nombre$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `rellenarComboMascotas` ()  NO SQL
SELECT id_mascota, nombre FROM mascotas$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `rellenarComboServicios` ()  NO SQL
SELECT id_servicio, m.nombre, tipo_servicio FROM servicio s INNER JOIN mascotas m ON m.id_mascota=s.fk_id_mascota WHERE estatus = 1 ORDER BY id_servicio ASC$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `verificarCorreo` (`correo_` VARCHAR(100))  SELECT correo FROM usuarios WHERE correo = correo_$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `verificarNombreDeUsuario` (`user_` VARCHAR(50))  SELECT user FROM usuarios where user = user_$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `verificarUsuarioyContrasena` (`id_` INT(11))  SELECT user, clave FROM usuarios WHERE id_usuario = id_$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dueno`
--

CREATE TABLE `dueno` (
  `id_dueno` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `telefono` varchar(12) NOT NULL,
  `cedula` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Disparadores `dueno`
--
DELIMITER $$
CREATE TRIGGER `dueno_AFTER_DELETE` AFTER DELETE ON `dueno` FOR EACH ROW BEGIN
	INSERT INTO historial_datos (tipo, datos, tabla_afectada) VALUES ('Eliminar', CONCAT('Nombre: ', OLD.nombre,', Cedula: ',OLD.cedula), 'Dueño');
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `dueno_AFTER_INSERT` AFTER INSERT ON `dueno` FOR EACH ROW BEGIN
	INSERT INTO historial_datos (tipo, datos, tabla_afectada) VALUES ('Crear', CONCAT('Nombre: ',NEW.nombre,', Cedula: ',NEW.cedula), 'Dueño');
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `dueno_AFTER_UPDATE` AFTER UPDATE ON `dueno` FOR EACH ROW BEGIN
    	INSERT INTO historial_datos (tipo, datos, tabla_afectada) VALUES ('Actualizar', CONCAT('Nombre: ',NEW.nombre,', Cedula: ',NEW.cedula), 'Dueño');
    
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial_datos`
--

CREATE TABLE `historial_datos` (
  `id_historial_datos` int(10) UNSIGNED NOT NULL,
  `tipo` varchar(16) DEFAULT NULL,
  `datos` varchar(150) DEFAULT NULL,
  `tabla_afectada` varchar(16) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial_servicios`
--

CREATE TABLE `historial_servicios` (
  `idhistorial` int(10) UNSIGNED NOT NULL,
  `tipo_servicio` enum('Consulta','Peluqueria','Cirugía') NOT NULL,
  `alergia` enum('SI','NO') NOT NULL,
  `fecha_programada` date NOT NULL,
  `observaciones` varchar(255) NOT NULL,
  `fecha_registro` datetime DEFAULT CURRENT_TIMESTAMP,
  `fk_id_servicio` int(10) UNSIGNED NOT NULL,
  `estatus` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascotas`
--

CREATE TABLE `mascotas` (
  `id_mascota` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `raza` varchar(45) NOT NULL,
  `color` varchar(45) NOT NULL,
  `fk_id_dueno` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Disparadores `mascotas`
--
DELIMITER $$
CREATE TRIGGER `mascotas_AFTER_DELETE` AFTER DELETE ON `mascotas` FOR EACH ROW BEGIN
	INSERT INTO historial_datos (tipo, datos, tabla_afectada) VALUES ('Eliminar', CONCAT('Nombre: ',OLD.nombre,', Raza: ',OLD.raza,', Color: ',OLD.color), 'Mascotas');
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `mascotas_AFTER_INSERT` AFTER INSERT ON `mascotas` FOR EACH ROW BEGIN
	INSERT INTO historial_datos (tipo, datos, tabla_afectada) VALUES ('Crear', CONCAT('Nombre: ',NEW.nombre,', Raza: ',NEW.raza,', Color: ',NEW.color), 'Mascotas');
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `mascotas_AFTER_UPDATE` AFTER UPDATE ON `mascotas` FOR EACH ROW BEGIN
INSERT INTO historial_datos (tipo, datos, tabla_afectada) VALUES ('Actualizar', CONCAT('Nombre: ',NEW.nombre,', Raza: ',NEW.raza,', Color: ',NEW.color), 'Mascotas');
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `rl_duenos_mascotas`
--
CREATE TABLE `rl_duenos_mascotas` (
`cedula` varchar(10)
,`dueno` varchar(45)
,`telefono` varchar(12)
,`nombre` varchar(45)
,`raza` varchar(45)
,`color` varchar(45)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `id_servicio` int(10) UNSIGNED NOT NULL,
  `tipo_servicio` enum('Consulta','Peluqueria','Cirugía') NOT NULL,
  `alergia` enum('SI','NO') NOT NULL,
  `fecha_programada` date NOT NULL,
  `observaciones` varchar(255) NOT NULL,
  `fk_id_mascota` int(10) UNSIGNED NOT NULL,
  `estatus` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Disparadores `servicio`
--
DELIMITER $$
CREATE TRIGGER `servicio_AFTER_INSERT` AFTER INSERT ON `servicio` FOR EACH ROW BEGIN
        INSERT INTO historial_servicios (tipo_servicio, alergia, fecha_programada, observacioneS, fk_id_servicio, estatus) VALUES 
    (NEW.tipo_servicio, NEW.alergia, NEW.fecha_programada, NEW.observaciones, NEW.id_servicio, NEW.estatus);
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `servicio_AFTER_UPDATE` AFTER UPDATE ON `servicio` FOR EACH ROW BEGIN
	UPDATE historial_servicios SET tipo_servicio = NEW.tipo_servicio, alergia = NEW.alergia, fecha_programada = NEW.fecha_programada, observaciones = NEW.observaciones, estatus = NEW.estatus WHERE fk_id_servicio = NEW.id_servicio;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) UNSIGNED NOT NULL,
  `user` varchar(50) DEFAULT NULL,
  `clave` varchar(50) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla de usuarios';

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `user`, `clave`, `correo`) VALUES
(1, 'admin', 'clave', 'admin@gmail.com'),
(2, 'carlos', '123', 'carlos@gmail.com');

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vista_serviciosa`
--
CREATE TABLE `vista_serviciosa` (
`id_servicio` int(10) unsigned
,`nombre` varchar(45)
,`tipo_servicio` enum('Consulta','Peluqueria','Cirugía')
,`alergia` enum('SI','NO')
,`fecha_programada` date
,`observaciones` varchar(255)
,`dueño` varchar(45)
,`telefono` varchar(12)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vista_serviciosi`
--
CREATE TABLE `vista_serviciosi` (
`id_servicio` int(10) unsigned
,`nombre` varchar(45)
,`tipo_servicio` enum('Consulta','Peluqueria','Cirugía')
,`alergia` enum('SI','NO')
,`fecha_programada` date
,`observaciones` varchar(255)
,`dueño` varchar(45)
,`telefono` varchar(12)
);

-- --------------------------------------------------------

--
-- Estructura para la vista `rl_duenos_mascotas`
--
DROP TABLE IF EXISTS `rl_duenos_mascotas`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `rl_duenos_mascotas`  AS  select `d`.`cedula` AS `cedula`,`d`.`nombre` AS `dueno`,`d`.`telefono` AS `telefono`,`m`.`nombre` AS `nombre`,`m`.`raza` AS `raza`,`m`.`color` AS `color` from (`dueno` `d` join `mascotas` `m` on((`d`.`id_dueno` = `m`.`fk_id_dueno`))) order by `d`.`cedula` ;

-- --------------------------------------------------------

--
-- Estructura para la vista `vista_serviciosa`
--
DROP TABLE IF EXISTS `vista_serviciosa`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista_serviciosa`  AS  select `s`.`id_servicio` AS `id_servicio`,`m`.`nombre` AS `nombre`,`s`.`tipo_servicio` AS `tipo_servicio`,`s`.`alergia` AS `alergia`,`s`.`fecha_programada` AS `fecha_programada`,`s`.`observaciones` AS `observaciones`,`d`.`nombre` AS `dueño`,`d`.`telefono` AS `telefono` from ((`mascotas` `m` join `servicio` `s`) join `dueno` `d` on(((`d`.`id_dueno` = `m`.`fk_id_dueno`) and (`s`.`fk_id_mascota` = `m`.`id_mascota`)))) where (`s`.`estatus` = 1) order by `s`.`id_servicio` ;

-- --------------------------------------------------------

--
-- Estructura para la vista `vista_serviciosi`
--
DROP TABLE IF EXISTS `vista_serviciosi`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vista_serviciosi`  AS  select `s`.`id_servicio` AS `id_servicio`,`m`.`nombre` AS `nombre`,`s`.`tipo_servicio` AS `tipo_servicio`,`s`.`alergia` AS `alergia`,`s`.`fecha_programada` AS `fecha_programada`,`s`.`observaciones` AS `observaciones`,`d`.`nombre` AS `dueño`,`d`.`telefono` AS `telefono` from ((`mascotas` `m` join `servicio` `s`) join `dueno` `d` on(((`d`.`id_dueno` = `m`.`fk_id_dueno`) and (`s`.`fk_id_mascota` = `m`.`id_mascota`)))) where (`s`.`estatus` = 0) ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `dueno`
--
ALTER TABLE `dueno`
  ADD PRIMARY KEY (`id_dueno`),
  ADD UNIQUE KEY `cedula_UNIQUE` (`cedula`);

--
-- Indices de la tabla `historial_datos`
--
ALTER TABLE `historial_datos`
  ADD PRIMARY KEY (`id_historial_datos`);

--
-- Indices de la tabla `historial_servicios`
--
ALTER TABLE `historial_servicios`
  ADD PRIMARY KEY (`idhistorial`),
  ADD KEY `fk_historial_servicios_servicio1_idx` (`fk_id_servicio`);

--
-- Indices de la tabla `mascotas`
--
ALTER TABLE `mascotas`
  ADD PRIMARY KEY (`id_mascota`),
  ADD KEY `FK_DUENO` (`fk_id_dueno`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`id_servicio`),
  ADD KEY `fk_servicio_mascotas1_idx` (`fk_id_mascota`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `user` (`user`),
  ADD UNIQUE KEY `correo` (`correo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `dueno`
--
ALTER TABLE `dueno`
  MODIFY `id_dueno` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `historial_datos`
--
ALTER TABLE `historial_datos`
  MODIFY `id_historial_datos` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `historial_servicios`
--
ALTER TABLE `historial_servicios`
  MODIFY `idhistorial` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `mascotas`
--
ALTER TABLE `mascotas`
  MODIFY `id_mascota` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `id_servicio` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `historial_servicios`
--
ALTER TABLE `historial_servicios`
  ADD CONSTRAINT `fk_historial_servicios_servicio1` FOREIGN KEY (`fk_id_servicio`) REFERENCES `servicio` (`id_servicio`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `mascotas`
--
ALTER TABLE `mascotas`
  ADD CONSTRAINT `FK_DUENO` FOREIGN KEY (`fk_id_dueno`) REFERENCES `dueno` (`id_dueno`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD CONSTRAINT `fk_servicio_mascotas1` FOREIGN KEY (`fk_id_mascota`) REFERENCES `mascotas` (`id_mascota`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
