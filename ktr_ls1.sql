-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 24 fév. 2020 à 16:59
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `ktr_ls1`
--

-- --------------------------------------------------------

--
-- Structure de la table `businesscard`
--

CREATE TABLE `businesscard` (
  `ID_Card` int(11) NOT NULL,
  `Serial` varchar(100) DEFAULT NULL,
  `ID_Profile` int(11) DEFAULT NULL,
  `TypeCard` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `businesscard`
--

INSERT INTO `businesscard` (`ID_Card`, `Serial`, `ID_Profile`, `TypeCard`) VALUES
(1, '4E0013f5879', 1, 'Black Card'),
(2, '1P0253d4680', 2, 'Visa Classic'),
(3, '5P467ZR0987', 2, 'Visa Premier'),
(4, '2M467MN2864', 3, 'Gold MasterCard');

-- --------------------------------------------------------

--
-- Structure de la table `ktrprofile`
--

CREATE TABLE `ktrprofile` (
  `ID_Profile` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Company` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Tel` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `ktrprofile`
--

INSERT INTO `ktrprofile` (`ID_Profile`, `Name`, `Company`, `Email`, `Tel`) VALUES
(1, 'Sara Zouioula', 'HorizonPro', 'zouioulasara@horizonpro.ma', '0777794710'),
(2, 'Imad Assif', 'Gifi', 'a.imad@gifi.fr', '0663789254'),
(3, 'Alexandre Bourdeau', 'OdcPlus', 'Alex_Bourdeau@gmail.fr', '06667835429');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `businesscard`
--
ALTER TABLE `businesscard`
  ADD PRIMARY KEY (`ID_Card`),
  ADD KEY `ID_Profile` (`ID_Profile`);

--
-- Index pour la table `ktrprofile`
--
ALTER TABLE `ktrprofile`
  ADD PRIMARY KEY (`ID_Profile`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `businesscard`
--
ALTER TABLE `businesscard`
  MODIFY `ID_Card` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT pour la table `ktrprofile`
--
ALTER TABLE `ktrprofile`
  MODIFY `ID_Profile` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `businesscard`
--
ALTER TABLE `businesscard`
  ADD CONSTRAINT `businesscard_ibfk_1` FOREIGN KEY (`ID_Profile`) REFERENCES `ktrprofile` (`ID_Profile`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
