-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 24-Set-2016 às 02:29
-- Versão do servidor: 5.6.13
-- versão do PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `farmacia`
--
CREATE DATABASE IF NOT EXISTS `farmacia` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `farmacia`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `administrador`
--

CREATE TABLE IF NOT EXISTS `administrador` (
  `codAdministrador` int(11) NOT NULL AUTO_INCREMENT,
  `matricula` int(11) NOT NULL,
  `codUsuario` int(11) NOT NULL,
  PRIMARY KEY (`codAdministrador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria`
--

CREATE TABLE IF NOT EXISTS `categoria` (
  `codCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`codCategoria`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Extraindo dados da tabela `categoria`
--

INSERT INTO `categoria` (`codCategoria`, `nome`) VALUES
(1, 'Alergias e Infecções'),
(2, 'Diabetes'),
(5, 'Digestão e Regulador Intestinal'),
(6, 'Dor e Contusão'),
(7, 'Gripes e Resfriados'),
(8, 'Digestão e Regulador Intestinal'),
(9, 'Dor e Contusão'),
(10, 'Gripes e Resfriados'),
(11, 'Pele e Mucosa'),
(12, 'Respiratório'),
(13, 'Dor e Contusão'),
(14, 'Respiratório'),
(15, 'Dor e Contusão'),
(16, 'Gripes e Resfriados'),
(17, 'Gripes e Resfriados');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `codCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `telefone` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `sexo` varchar(20) DEFAULT NULL,
  `cpf` varchar(20) NOT NULL,
  `rg` varchar(20) DEFAULT NULL,
  `situacao` varchar(20) DEFAULT NULL,
  `nascimento` date DEFAULT NULL,
  PRIMARY KEY (`codCliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=35 ;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`codCliente`, `nome`, `telefone`, `email`, `sexo`, `cpf`, `rg`, `situacao`, `nascimento`) VALUES
(33, 'jonathan alves', '', 'jonathanalves122@hotmail.com', 'M', '148.840.667-44', '', 'e-comerce', '0000-00-00'),
(34, 'jonathan alves', '', 'jj@hotmail.com', 'M', '123456', '', 'e-comerce', '0000-00-00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientee`
--

CREATE TABLE IF NOT EXISTS `clientee` (
  `codClienteE` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `codCliente` int(11) NOT NULL,
  PRIMARY KEY (`codClienteE`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

--
-- Extraindo dados da tabela `clientee`
--

INSERT INTO `clientee` (`codClienteE`, `login`, `senha`, `codCliente`) VALUES
(22, 'jonathan12244', 'puma123456', 33),
(23, 'kk', '123', 34);

-- --------------------------------------------------------

--
-- Estrutura da tabela `endereco`
--

CREATE TABLE IF NOT EXISTS `endereco` (
  `codEndereco` int(11) NOT NULL AUTO_INCREMENT,
  `logradouro` varchar(50) NOT NULL,
  `numero` varchar(50) NOT NULL,
  `complemento` varchar(50) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `estado` varchar(50) NOT NULL,
  `cep` varchar(50) NOT NULL,
  `codCliente` int(11) NOT NULL,
  PRIMARY KEY (`codEndereco`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE IF NOT EXISTS `fornecedor` (
  `codFornecedor` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `cnpj` varchar(50) NOT NULL,
  `telefone` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`codFornecedor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE IF NOT EXISTS `funcionario` (
  `codFuncionario` int(11) NOT NULL AUTO_INCREMENT,
  `matricula` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `sexo` varchar(20) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `rg` varchar(20) NOT NULL,
  `nascimento` date NOT NULL,
  `salario` float NOT NULL,
  `codUsuario` int(11) NOT NULL,
  PRIMARY KEY (`codFuncionario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `imagem`
--

CREATE TABLE IF NOT EXISTS `imagem` (
  `cod` int(11) NOT NULL AUTO_INCREMENT,
  `imagem` blob NOT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `item_de_pedido`
--

CREATE TABLE IF NOT EXISTS `item_de_pedido` (
  `codItemDePedido` int(11) NOT NULL AUTO_INCREMENT,
  `quantidade` int(11) NOT NULL,
  `codPedido` int(11) NOT NULL,
  `codProduto` int(11) NOT NULL,
  PRIMARY KEY (`codItemDePedido`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE IF NOT EXISTS `pedido` (
  `codPedido` int(11) NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `tipoPagamento` varchar(50) NOT NULL,
  `situacao` varchar(20) NOT NULL,
  `valorPago` float NOT NULL,
  `Valor_a_Pagar` float NOT NULL,
  `parcelas` int(11) NOT NULL,
  `codUsuario` int(11) NOT NULL,
  PRIMARY KEY (`codPedido`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedidofornecedor`
--

CREATE TABLE IF NOT EXISTS `pedidofornecedor` (
  `codPedidoFornecedor` int(11) NOT NULL AUTO_INCREMENT,
  `dataPedido` date NOT NULL,
  `valor` float NOT NULL,
  `status` varchar(10) NOT NULL,
  `PrevisaoEntrega` varchar(30) NOT NULL,
  `dataEntrega` date NOT NULL,
  `numeroPedido` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `lote` varchar(11) NOT NULL,
  `codProduto` int(11) NOT NULL,
  `codFornecedor` int(11) NOT NULL,
  PRIMARY KEY (`codPedidoFornecedor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
  `codProduto` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `valor_custo` float NOT NULL,
  `valor_venda` float NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `fornecedor` varchar(100) NOT NULL,
  `dataFabricacao` date NOT NULL,
  `marca` varchar(50) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `vencimento` date NOT NULL,
  `imagem` varchar(255) NOT NULL,
  `codCategoria` int(11) NOT NULL,
  PRIMARY KEY (`codProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`codProduto`, `nome`, `valor_custo`, `valor_venda`, `descricao`, `fornecedor`, `dataFabricacao`, `marca`, `quantidade`, `vencimento`, `imagem`, `codCategoria`) VALUES
(2, 'Histamin 2mg Elite 20 Comprimidos', 6.21, 6.21, 'Histamin 2mg Elite 20 Comprimidos promove alívio sintomático das seguintes manifestações alérgicas: dermatite atópica e de contato, eczemas alérgicos, urticária, angioedema, reações a drogas e soros, picadas de insetos, pruridos anais, vulvares de origem ', 'neo quimica', '2016-09-05', 'Histamin ', 10, '2017-09-05', 'images/logo.jpg', 6),
(3, 'Histamin 2mg Elite 20 Comprimidos', 6.21, 6.21, 'Histamin 2mg Elite 20 Comprimidos promove alívio sintomático das seguintes manifestações alérgicas: dermatite atópica e de contato, eczemas alérgicos, urticária, angioedema, reações a drogas e soros, picadas de insetos, pruridos anais, vulvares de origem ', 'neo quimica', '2016-09-05', 'Histamin ', 10, '2017-09-05', 'images/logo.jpg', 6),
(4, 'Histamin 2mg Elite 20 Comprimidos', 6.21, 6.21, 'Histamin 2mg Elite 20 Comprimidos promove alívio sintomático das seguintes manifestações alérgicas: dermatite atópica e de contato, eczemas alérgicos, urticária, angioedema, reações a drogas e soros, picadas de insetos, pruridos anais, vulvares de origem ', 'neo quimica', '2016-09-05', 'Histamin ', 10, '2017-09-05', 'images/logo.jpg', 0),
(5, 'Histamin 2mg Elite 20 Comprimidos', 6.21, 6.21, 'Histamin 2mg Elite 20 Comprimidos promove alívio sintomático das seguintes manifestações alérgicas: dermatite atópica e de contato, eczemas alérgicos, urticária, angioedema, reações a drogas e soros, picadas de insetos, pruridos anais, vulvares de origem ', 'neo quimica', '2016-09-05', 'Histamin ', 10, '2017-09-05', 'images/logo.jpg', 0),
(6, 'Histamin 2mg Elite 20 Comprimidos', 6.21, 6.21, 'Histamin 2mg Elite 20 Comprimidos promove alívio sintomático das seguintes manifestações alérgicas: dermatite atópica e de contato, eczemas alérgicos, urticária, angioedema, reações a drogas e soros, picadas de insetos, pruridos anais, vulvares de origem ', 'neo quimica', '2016-09-05', 'Histamin ', 10, '2017-09-05', 'images/logo.jpg', 0),
(7, 'Histamin 2mg Elite 20 Comprimidos', 6.21, 6.21, 'Histamin 2mg Elite 20 Comprimidos promove alívio sintomático das seguintes manifestações alérgicas: dermatite atópica e de contato, eczemas alérgicos, urticária, angioedema, reações a drogas e soros, picadas de insetos, pruridos anais, vulvares de origem ', 'neo quimica', '2016-09-05', 'Histamin ', 10, '2017-09-05', 'images/logo.jpg', 0),
(8, ' Comprimidos', 1.2, 1.2, 'teste jonathan', 'do jjonathan', '2016-09-05', 'Histamin ', 10, '2017-09-05', 'images/logo.jpg', 0),
(9, 'de pingar ', 1.2, 1.2, 'teste jonathan', 'do jjonathan', '2016-09-05', 'Histamin ', 10, '2017-09-05', 'images/logo.jpg', 6),
(10, 'dorflex comprímido', 12.5, 12.5, 'dorflex para dores musculares e dores de cabeça ', 'dorflex t.i', '2016-07-15', 'neo quimica', 5, '2016-09-15', 'images/logo.jpg', 6),
(11, 'dorflex comprímido', 12.5, 12.5, 'dorflex para dores musculares e dores de cabeça ', 'dorflex t.i', '2016-07-15', 'neo quimica', 5, '2016-09-15', 'images/logo.jpg', 6),
(12, 'Histamin 2mg Elite 20 Comprimidos', 6.21, 6.21, 'Histamin 2mg Elite 20 Comprimidos promove alívio sintomático das seguintes manifestações alérgicas: dermatite atópica e de contato, eczemas alérgicos, urticária, angioedema, reações a drogas e soros, picadas de insetos, pruridos anais, vulvares de origem ', 'neo quimica', '2016-09-05', 'Histamin ', 10, '2017-09-05', 'images/logo.jpg', 0),
(13, 'Histamin 2mg Elite 20 Comprimidos', 6.21, 6.21, 'Histamin 2mg Elite 20 Comprimidos promove alívio sintomático das seguintes manifestações alérgicas: dermatite atópica e de contato, eczemas alérgicos, urticária, angioedema, reações a drogas e soros, picadas de insetos, pruridos anais, vulvares de origem ', 'neo quimica', '2016-09-05', 'Histamin ', 10, '2017-09-05', 'images/logo.jpg', 6),
(14, 'Histamin 2mg Elite 20 Comprimidos', 6.21, 6.21, 'Histamin 2mg Elite 20 Comprimidos promove alívio sintomático das seguintes manifestações alérgicas: dermatite atópica e de contato, eczemas alérgicos, urticária, angioedema, reações a drogas e soros, picadas de insetos, pruridos anais, vulvares de origem ', 'neo quimica', '2016-09-05', 'Histamin ', 10, '2017-09-05', 'images/logo.jpg', 6);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `codUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(30) NOT NULL,
  `senha` varchar(30) NOT NULL,
  `tipo` int(2) NOT NULL,
  `descricao` varchar(100) NOT NULL,
  PRIMARY KEY (`codUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
