<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 ">


<script language="JavaScript">
 function mascara(t, mask){
 var i = t.value.length;
 var saida = mask.substring(1,0);
 var texto = mask.substring(i)
 if (texto.substring(0,1) != saida){
 t.value += texto.substring(0,1);
 }
 }
 </script>
	<form action="" method="" id="formCadastroUsuario">
	<div class="row">
			<legend>Cadastro de usuários</legend>

			<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 ">
					<label for="nome">Nome:</label>
					<input class="form-control" type="text" id="nome" name="nome" placeholder="Digite seu nome completo."/>
				</div>	
			</div>	
				
			<div class="row">
			
				<div class="col-xs-12 col-sm-4 col-md-4 col-lg-3 ">
					<label for="idade">Data de Nascimento:</label>
					<input class="form-control" type="date" id="datepicker2" name="dataaquisicao" placeholder="__/__/____"/>
				</div>	
				
				
				<div class="col-xs-12 col-sm-4 col-md-4 col-lg-3 ">
					<label for="cpf">CPF:</label>
					<input class="form-control" type="text" id="cpf" name="cpf"   placeholder="Digite seu CPF."/>
				</div>
					
				
				<div class="col-xs-12 col-sm-4 col-md-4 col-lg-3 ">
					<div class="form-group cadastrolivro">
					<label class="" for="publicacao">Sexo:</label>
						<select class="form-control" id="tipopublic" name="tipopublic">
						<option selected="selected">Masculino ou feminino</option>
						<option id="masculino" value="masculino">Masculino</option>
						<option id="feminino" value="feminino">Feminino</option>
						</select>
					</div>
				</div>				
	
			</div>


			<div class="row">
				
				
				<div class="col-xs-12 col-sm-6">
				<div class="form-group">
					<label for="email_pessoal">Email:</label>
					<input class="form-control" type="email" id="email_pessoal" name="email_pessoal" placeholder="Digite seu Email."/>
				</div>	
				</div>	

				
				<div class="col-xs-12 col-sm-6">
				<div class="form-group">
					<label for="repita_email_pessoal">Confirmação de Email:</label>
					<input class="form-control" type="email" id="repita_email_pessoal" name="repita_email_pessoal" placeholder="Repita seu Email." />
				</div>
				</div>	
				

			</div>
				
			<div class="row">
				<div class="col-xs-12 col-sm-6">
				<div class="form-group">
					<label for="rsenha">Senha:</label>
					<input class="form-control" type="password" id="senha" name="senha" placeholder="Digite sua Senha."/>
				</div>
				</div>
				
								
				<div class="col-xs-12 col-sm-6">
				<div class="form-group">
					<label for="rsenha">Confirmação de senha:</label>
					<input class="form-control" type="password" id="confirmasenha" name="senha" placeholder="Confirme sua Senha."/>
				</div>
				</div>
			</div>

				

			<div class="row">
			
				<div class="col-xs-12 col-sm-4">
					<label for="celular">(DDD) Celular:</label>
					<input class="form-control" type="text" id="celular" name="celular" onkeypress="mascara(this, '## #-####-####')" maxlength="14" placeholder="Digite seu Celular."/>
				</div>	
				
				<div class="col-xs-12 col-sm-4">
					<label for="telefone">(DDD) Telefone:</label>
					<input class="form-control" type="text" id="telefone" name="telefone" onkeypress="mascara(this, '## ####-####')" maxlength="12" placeholder="Digite seu Telefone."/>
				</div>	

				
			</div>
			

		
		<legend>Endereço</legend>
		
		<div class="row">
			<div class="col-xs-12 col-sm-12">
				<div class="form-group cadastrolivro">
					<label for="titulolivro">Nome</label>
					<input class="form-control" id="titulolivro" placeholder="Nome da biblioteca">
				</div> 
			</div> 
		</div> 
	
		<div class="row">
		

		<div class="col-xs-12 col-sm-4">
			<div class="select" class="form-group">
				<label for="estados">Estado:</label>	
				<select class="form-control" name="estados">
						<option value="0">Selecione</option>
						<option value="ac">Acre</option>
						<option value="al">Alagoas</option>
						<option value="ap">Amapá</option>
						<option value="am">Amazonas</option>
						<option value="ba">Bahia</option>
						<option value="ce">Ceará</option>
						<option value="df">Distrito Federal</option>
						<option value="es">Espirito Santo</option>
						<option value="go">Goiás</option>
						<option value="ma">Maranhão</option>
						<option value="ms">Mato Grosso do Sul</option>
						<option value="mt">Mato Grosso</option>
						<option value="mg">Minas Gerais</option>
						<option value="pa">Pará</option>
						<option value="pb">Paraíba</option>
						<option value="pr">Paraná</option>
						<option value="pe">Pernambuco</option>
						<option value="pi">Piauí</option>
						<option value="rj">Rio de Janeiro</option>
						<option value="rn">Rio Grande do Norte</option>
						<option value="rs">Rio Grande do Sul</option>
						<option value="ro">Rondônia</option>
						<option value="rr">Roraima</option>
						<option value="sc">Santa Catarina</option>
						<option value="sp">São Paulo</option>
						<option value="se">Sergipe</option>
						<option value="to">Tocantins</option>
				</select>
			</div>
		</div>

			<div class="col-xs-12 col-sm-3">
				<div class="form-group">
					<label for="cep">Cep:</label>
					<input class="form-control" type="text" id="cep" name="cep" onkeypress="mascara(this, '##.###-###')" maxlength="10" placeholder="Digite seu Cep"/>
				</div>	
			</div>	
			
			<div class="col-xs-12 col-sm-5">
				<div class="form-group">
					<label for="bairro">Bairro:</label>
					<input class="form-control" type="text" id="bairro" name="bairro" placeholder="Digite seu bairro"/>
				</div>
			</div>		

		</div>
		
		<div class="row">
		
		<div class="col-xs-12 col-sm-12">
			<div class="form-group">
				<label for="endereco" >Logradouro:</label>
				<input class="form-control" type="text" id="end" name="endereco" placeholder="Digite seu logradouro"/>
			</div>
		</div>	

		</div>


		<div class="row">
		
		
		<div class="col-xs-12 col-sm-4">
			<div class="form-group">
				<label for="numero">Número:</label>
				<input class="form-control" type="text" id="numEnd" name="numero" placeholder="Digite seu número"/>
			</div>
		</div>	
		</div>
		
		<div class="row">
			
		<div class="col-xs-12 col-sm-12">
			<div class="form-group">
				<!--<p class="text-info">Apenas imagens jpg, jpeg e png</p>-->
				<label for="arquivo">Escolha sua imagem <p class="text-info">(Apenas imagens jpg, jpeg ou png)</p></label>
			</div>

			<div class="form-group">
				<!--<p class="text-info">Apenas imagens jpg, jpeg e png</p>-->
				<input type="file" name="arquivo" id="arquivo" >
			</div>
		</div>	
		
		</div>
		
		
		
		<div class="row">
				<div class="col-xs-12 col-sm-12">
				<label>Informe seu género favorito:</label>
			
				<div class="checkbox">
				
				
					<label for="autoajuda">
						<input type="checkbox" id="autoajuda" name="autoajuda"/>Auto Ajuda
					</label>
				
					<label for="aventura">
						<input type="checkbox" id="aventura" name="aventura"/>Aventura
					</label>
					
				
					<label for="biografia">
						<input type="checkbox" id="biografia" name="biografia"/>Biografia
					</label>
				
					<label for="comedia">
						<input type="checkbox" id="comedia" name="comedia"/>Comédia
					</label>
				
					<label for="contos">
						<input type="checkbox" id="contos" name="contos"/>Contos
					</label>
					
				
					<label for="drama">
						<input type="checkbox" id="drama" name="drama"/>Drama
					</label>
					
					<label for="estudos">
						<input type="checkbox" id="estudos" name="estudos"/>Estudos
					</label>
					
					<label for="ficcao">
						<input type="checkbox" id="ficcao" name="ficcao"/>Ficção
					</label>
					
					<label for="historia">
						<input type="checkbox" id="historia" name="historia"/>História
					</label>
					
					<label for="poesia">
						<input type="checkbox" id="poesia" name="poesia"/>Poesia
					</label>
					
					<label for="romantico">
						<input type="checkbox" id="romantico" name="romantico"/>Romance
					</label>
					
					<label for="policial">
						<input type="checkbox" id="policial" name="policial"/>Romance Policial
					</label>
					
					<label for="terror">
						<input type="checkbox" id="terror" name="terror"/>Terror
					</label>
					
					<label for="outro">
						<input type="checkbox" id="outro" name="outro"/>Outros
					</label>
					
				</div>	
				</div>	
		</div>

			<div class="form-group">
				<input class="btn btn-default" type="submit" value="Finalizar Cadastro" id="enviar"/>
			</div>

	
	</div>
	</form>
</div>


		<!--
		<div class="col-xs-12 col-sm-3">
			<div class="select" class="form-group">
				<label id="pais" name="pais">País:</label>
					<select class="form-control" id="pais" name="pais">
							<option selected="selected">Selecione...</option>
							<option value="Brasil" >Brasil</option>
							<option value="afeganistão">Afeganistão</option>
							<option value="África do Sul">África do Sul</option>
							<option value="Albânia">Albânia</option>
							<option value="Alemanha">Alemanha</option>
							<option value="Andorra">Andorra</option>
							<option value="Angola">Angola</option>
							<option value="Anguilla">Anguilla</option>
							<option value="Antilhas Holandesas">Antilhas Holandesas</option>
							<option value="Antárctida">Antárctida</option>
							<option value="Antígua e Barbuda">Antígua e Barbuda</option>
							<option value="Argentina">Argentina</option>
							<option value="Argélia">Argélia</option>
							<option value="Armênia">Armênia</option>
							<option value="Aruba">Aruba</option>
							<option value="Arábia Saudita">Arábia Saudita</option>
							<option value="Austrália">Austrália</option>
							<option value="Áustria">Áustria</option>
							<option value="Azerbaijão">Azerbaijão</option>
							<option value="Bahamas">Bahamas</option>
							<option value="Bahrein">Bahrein</option>
							<option value="Bangladesh">Bangladesh</option>
							<option value="Barbados">Barbados</option>
							<option value="Belize">Belize</option>
							<option value="Benim">Benim</option>
							<option value="Bermudas">Bermudas</option>
							<option value="Bielorrússia">Bielorrússia</option>
							<option value="Bolívia">Bolívia</option>
							<option value="Botswana">Botswana</option>
							<option value="Brunei">Brunei</option>
							<option value="Bulgária">Bulgária</option>
							<option value="Burkina Faso">Burkina Faso</option>
							<option value="Burundi">Burundi</option>
							<option value="Butão">Butão</option>
							<option value="Bélgica">Bélgica</option>
							<option value="Bósnia e Herzegovina">Bósnia e Herzegovina</option>
							<option value="Cabo Verde">Cabo Verde</option>
							<option value="Camarões">Camarões</option>
							<option value="Camboja">Camboja</option>
							<option value="Canadá">Canadá</option>
							<option value="Catar">Catar</option>
							<option value="Cazaquistão">Cazaquistão</option>
							<option value="Chade">Chade</option>
							<option value="Chile">Chile</option>
							<option value="China">China</option>
							<option value="Chipre">Chipre</option>
							<option value="Colômbia">Colômbia</option>
							<option value="Comores">Comores</option>
							<option value="Coreia do Norte">Coreia do Norte</option>
							<option value="Coreia do Sul">Coreia do Sul</option>
							<option value="Costa do Marfim">Costa do Marfim</option>
							<option value="Costa Rica">Costa Rica</option>
							<option value="Croácia">Croácia</option>
							<option value="Cuba">Cuba</option>
							<option value="Dinamarca">Dinamarca</option>
							<option value="Djibouti">Djibouti</option>
							<option value="Dominica">Dominica</option>
							<option value="Egito">Egito</option>
							<option value="El Salvador">El Salvador</option>
							<option value="Emirados Árabes Unidos">Emirados Árabes Unidos</option>
							<option value="Equador">Equador</option>
							<option value="Eritreia">Eritreia</option>
							<option value="Escócia">Escócia</option>
							<option value="Eslováquia">Eslováquia</option>
							<option value="Eslovênia">Eslovênia</option>
							<option value="Espanha">Espanha</option>
							<option value="Estados Federados da Micronésia">Estados Federados da Micronésia</option>
							<option value="Estados Unidos">Estados Unidos</option>
							<option value="Estônia">Estônia</option>
							<option value="Etiópia">Etiópia</option>
							<option value="Fiji">Fiji</option>
							<option value="Filipinas">Filipinas</option>
							<option value="Finlândia">Finlândia</option>
							<option value="França">França</option>
							<option value="Gabão">Gabão</option>
							<option value="Gana">Gana</option>
							<option value="Geórgia">Geórgia</option>
							<option value="Gibraltar">Gibraltar</option>
							<option value="Granada">Granada</option>
							<option value="Gronelândia">Gronelândia</option>
							<option value="Grécia">Grécia</option>
							<option value="Guadalupe">Guadalupe</option>
							<option value="Guam">Guam</option>
							<option value="Guatemala">Guatemala</option>
							<option value="Guernesei">Guernesei</option>
							<option value="Guiana">Guiana</option>
							<option value="Guiana Francesa">Guiana Francesa</option>
							<option value="Guiné">Guiné</option>
							<option value="Guiné Equatorial">Guiné Equatorial</option>
							<option value="Guiné-Bissau">Guiné-Bissau</option>
							<option value="Gâmbia">Gâmbia</option>
							<option value="Haiti">Haiti</option>
							<option value="Honduras">Honduras</option>
							<option value="Hong Kong">Hong Kong</option>
							<option value="Hungria">Hungria</option>
							<option value="Ilha Bouvet">Ilha Bouvet</option>
							<option value="Ilha de Man">Ilha de Man</option>
							<option value="Ilha do Natal">Ilha do Natal</option>
							<option value="Ilha Heard e Ilhas McDonald">Ilha Heard e Ilhas McDonald</option>
							<option value="Ilha Norfolk">Ilha Norfolk</option>
							<option value="Ilhas Cayman">Ilhas Cayman</option>
							<option value="Ilhas Cocos (Keeling)">Ilhas Cocos (Keeling)</option>
							<option value="Ilhas Cook">Ilhas Cook</option>
							<option value="Ilhas Feroé">Ilhas Feroé</option>
							<option value="Ilhas Geórgia do Sul e Sandwich do Sul">Ilhas Geórgia do Sul e Sandwich do Sul</option>
							<option value="Ilhas Malvinas">Ilhas Malvinas</option>
							<option value="Ilhas Marshall">Ilhas Marshall</option>
							<option value="Ilhas Menores Distantes dos Estados Unidos">Ilhas Menores Distantes dos Estados Unidos</option>
							<option value="Ilhas Salomão">Ilhas Salomão</option>
							<option value="Ilhas Virgens Americanas">Ilhas Virgens Americanas</option>
							<option value="Ilhas Virgens Britânicas">Ilhas Virgens Britânicas</option>
							<option value="Ilhas Åland">Ilhas Åland</option>
							<option value="Indonésia">Indonésia</option>
							<option value="Inglaterra">Inglaterra</option>
							<option value="Índia">Índia</option>
							<option value="Iraque">Iraque</option>
							<option value="Irlanda do Norte">Irlanda do Norte</option>
							<option value="Irlanda">Irlanda</option>
							<option value="Irã">Irã</option>
							<option value="Islândia">Islândia</option>
							<option value="Israel">Israel</option>
							<option value="Itália">Itália</option>
							<option value="Iêmen">Iêmen</option>
							<option value="Jamaica">Jamaica</option>
							<option value="Japão">Japão</option>
							<option value="Jersey">Jersey</option>
							<option value="Jordânia">Jordânia</option>
							<option value="Kiribati">Kiribati</option>
							<option value="Kuwait">Kuwait</option>
							<option value="Laos">Laos</option>
							<option value="Lesoto">Lesoto</option>
							<option value="Letônia">Letônia</option>
							<option value="Libéria">Libéria</option>
							<option value="Liechtenstein">Liechtenstein</option>
							<option value="Lituânia">Lituânia</option>
							<option value="Luxemburgo">Luxemburgo</option>
							<option value="Líbano">Líbano</option>
							<option value="Líbia">Líbia</option>
							<option value="Macau">Macau</option>
							<option value="Macedônia">Macedônia</option>
							<option value="Madagáscar">Madagáscar</option>
							<option value="Malawi">Malawi</option>
							<option value="Maldivas">Maldivas</option>
							<option value="Mali">Mali</option>
							<option value="Malta">Malta</option>
							<option value="Malásia">Malásia</option>
							<option value="Marianas Setentrionais">Marianas Setentrionais</option>
							<option value="Marrocos">Marrocos</option>
							<option value="Martinica">Martinica</option>
							<option value="Mauritânia">Mauritânia</option>
							<option value="Maurícia">Maurícia</option>
							<option value="Mayotte">Mayotte</option>
							<option value="Moldávia">Moldávia</option>
							<option value="Mongólia">Mongólia</option>
							<option value="Montenegro">Montenegro</option>
							<option value="Montserrat">Montserrat</option>
							<option value="Moçambique">Moçambique</option>
							<option value="Myanmar">Myanmar</option>
							<option value="México">México</option>
							<option value="Mônaco">Mônaco</option>
							<option value="Namíbia">Namíbia</option>
							<option value="Nauru">Nauru</option>
							<option value="Nepal">Nepal</option>
							<option value="Nicarágua">Nicarágua</option>
							<option value="Nigéria">Nigéria</option>
							<option value="Niue">Niue</option>
							<option value="Noruega">Noruega</option>
							<option value="Nova Caledônia">Nova Caledônia</option>
							<option value="Nova Zelândia">Nova Zelândia</option>
							<option value="Níger">Níger</option>
							<option value="Omã">Omã</option>
							<option value="Palau">Palau</option>
							<option value="Palestina">Palestina</option>
							<option value="Panamá">Panamá</option>
							<option value="Papua-Nova Guiné">Papua-Nova Guiné</option>
							<option value="Paquistão">Paquistão</option>
							<option value="Paraguai">Paraguai</option>
							<option value="País de Gales">País de Gales</option>
							<option value="Países Baixos">Países Baixos</option>
							<option value="Peru">Peru</option>
							<option value="Pitcairn">Pitcairn</option>
							<option value="Polinésia Francesa">Polinésia Francesa</option>
							<option value="Polônia">Polônia</option>
							<option value="Porto Rico">Porto Rico</option>
							<option value="Portugal">Portugal</option>
							<option value="Quirguistão">Quirguistão</option>
							<option value="Quênia">Quênia</option>
							<option value="Reino Unido">Reino Unido</option>
							<option value="República Centro-Africana">República Centro-Africana</option>
							<option value="República Checa">República Checa</option>
							<option value="República Democrática do Congo">República Democrática do Congo</option>
							<option value="República do Congo">República do Congo</option>
							<option value="República Dominicana">República Dominicana</option>
							<option value="Reunião">Reunião</option>
							<option value="Romênia">Romênia</option>
							<option value="Ruanda">Ruanda</option>
							<option value="Rússia">Rússia</option>
							<option value="Saara Ocidental">Saara Ocidental</option>
							<option value="Saint Martin">Saint Martin</option>
							<option value="Saint-Barthélemy">Saint-Barthélemy</option>
							<option value="Saint-Pierre e Miquelon">Saint-Pierre e Miquelon</option>
							<option value="Samoa Americana">Samoa Americana</option>
							<option value="Samoa">Samoa</option>
							<option value="Santa Helena, Ascensão e Tristão da Cunha">Santa Helena, Ascensão e Tristão da Cunha</option>
							<option value="Santa Lúcia">Santa Lúcia</option>
							<option value="Senegal">Senegal</option>
							<option value="Serra Leoa">Serra Leoa</option>
							<option value="Seychelles">Seychelles</option>
							<option value="Singapura">Singapura</option>
							<option value="Somália">Somália</option>
							<option value="Sri Lanka">Sri Lanka</option>
							<option value="Suazilândia">Suazilândia</option>
							<option value="Sudão">Sudão</option>
							<option value="Suriname">Suriname</option>
							<option value="Suécia">Suécia</option>
							<option value="Suíça">Suíça</option>
							<option value="Svalbard e Jan Mayen">Svalbard e Jan Mayen</option>
							<option value="São Cristóvão e Nevis">São Cristóvão e Nevis</option>
							<option value="São Marino">São Marino</option>
							<option value="São Tomé e Príncipe">São Tomé e Príncipe</option>
							<option value="São Vicente e Granadinas">São Vicente e Granadinas</option>
							<option value="Sérvia">Sérvia</option>
							<option value="Síria">Síria</option>
							<option value="Tadjiquistão">Tadjiquistão</option>
							<option value="Tailândia">Tailândia</option>
							<option value="Taiwan">Taiwan</option>
							<option value="Tanzânia">Tanzânia</option>
							<option value="Terras Austrais e Antárticas Francesas">Terras Austrais e Antárticas Francesas</option>
							<option value="Território Britânico do Oceano Índico">Território Britânico do Oceano Índico</option>
							<option value="Timor-Leste">Timor-Leste</option>
							<option value="Togo">Togo</option>
							<option value="Tonga">Tonga</option>
							<option value="Toquelau">Toquelau</option>
							<option value="Trinidad e Tobago">Trinidad e Tobago</option>
							<option value="Tunísia">Tunísia</option>
							<option value="Turcas e Caicos">Turcas e Caicos</option>
							<option value="Turquemenistão">Turquemenistão</option>
							<option value="Turquia">Turquia</option>
							<option value="Tuvalu">Tuvalu</option>
							<option value="Ucrânia">Ucrânia</option>
							<option value="Uganda">Uganda</option>
							<option value="Uruguai">Uruguai</option>
							<option value="Uzbequistão">Uzbequistão</option>
							<option value="Vanuatu">Vanuatu</option>
							<option value="Vaticano">Vaticano</option>
							<option value="Venezuela">Venezuela</option>
							<option value="Vietname">Vietname</option>
							<option value="Wallis e Futuna">Wallis e Futuna</option>
							<option value="Zimbabwe">Zimbabwe</option>
							<option value="Zâmbia">Zâmbia</option>
					</select>
					
			</div>
		</div>	-->

<!--
					<div class="form-group">
						<label id="pais" name="pais">País:</label>
							<select class="form-control" id="pais" name="pais">
							<option selected="selected">Selecione...</option>
							<option value="Brasil" >Brasil</option>
							<option value="afeganistão">Afeganistão</option>
							<option value="África do Sul">África do Sul</option>
							<option value="Albânia">Albânia</option>
							<option value="Alemanha">Alemanha</option>
							<option value="Andorra">Andorra</option>
							<option value="Angola">Angola</option>
							<option value="Anguilla">Anguilla</option>
							<option value="Antilhas Holandesas">Antilhas Holandesas</option>
							<option value="Antárctida">Antárctida</option>
							<option value="Antígua e Barbuda">Antígua e Barbuda</option>
							<option value="Argentina">Argentina</option>
							<option value="Argélia">Argélia</option>
							<option value="Armênia">Armênia</option>
							<option value="Aruba">Aruba</option>
							<option value="Arábia Saudita">Arábia Saudita</option>
							<option value="Austrália">Austrália</option>
							<option value="Áustria">Áustria</option>
							<option value="Azerbaijão">Azerbaijão</option>
							<option value="Bahamas">Bahamas</option>
							<option value="Bahrein">Bahrein</option>
							<option value="Bangladesh">Bangladesh</option>
							<option value="Barbados">Barbados</option>
							<option value="Belize">Belize</option>
							<option value="Benim">Benim</option>
							<option value="Bermudas">Bermudas</option>
							<option value="Bielorrússia">Bielorrússia</option>
							<option value="Bolívia">Bolívia</option>
							<option value="Botswana">Botswana</option>
							<option value="Brunei">Brunei</option>
							<option value="Bulgária">Bulgária</option>
							<option value="Burkina Faso">Burkina Faso</option>
							<option value="Burundi">Burundi</option>
							<option value="Butão">Butão</option>
							<option value="Bélgica">Bélgica</option>
							<option value="Bósnia e Herzegovina">Bósnia e Herzegovina</option>
							<option value="Cabo Verde">Cabo Verde</option>
							<option value="Camarões">Camarões</option>
							<option value="Camboja">Camboja</option>
							<option value="Canadá">Canadá</option>
							<option value="Catar">Catar</option>
							<option value="Cazaquistão">Cazaquistão</option>
							<option value="Chade">Chade</option>
							<option value="Chile">Chile</option>
							<option value="China">China</option>
							<option value="Chipre">Chipre</option>
							<option value="Colômbia">Colômbia</option>
							<option value="Comores">Comores</option>
							<option value="Coreia do Norte">Coreia do Norte</option>
							<option value="Coreia do Sul">Coreia do Sul</option>
							<option value="Costa do Marfim">Costa do Marfim</option>
							<option value="Costa Rica">Costa Rica</option>
							<option value="Croácia">Croácia</option>
							<option value="Cuba">Cuba</option>
							<option value="Dinamarca">Dinamarca</option>
							<option value="Djibouti">Djibouti</option>
							<option value="Dominica">Dominica</option>
							<option value="Egito">Egito</option>
							<option value="El Salvador">El Salvador</option>
							<option value="Emirados Árabes Unidos">Emirados Árabes Unidos</option>
							<option value="Equador">Equador</option>
							<option value="Eritreia">Eritreia</option>
							<option value="Escócia">Escócia</option>
							<option value="Eslováquia">Eslováquia</option>
							<option value="Eslovênia">Eslovênia</option>
							<option value="Espanha">Espanha</option>
							<option value="Estados Federados da Micronésia">Estados Federados da Micronésia</option>
							<option value="Estados Unidos">Estados Unidos</option>
							<option value="Estônia">Estônia</option>
							<option value="Etiópia">Etiópia</option>
							<option value="Fiji">Fiji</option>
							<option value="Filipinas">Filipinas</option>
							<option value="Finlândia">Finlândia</option>
							<option value="França">França</option>
							<option value="Gabão">Gabão</option>
							<option value="Gana">Gana</option>
							<option value="Geórgia">Geórgia</option>
							<option value="Gibraltar">Gibraltar</option>
							<option value="Granada">Granada</option>
							<option value="Gronelândia">Gronelândia</option>
							<option value="Grécia">Grécia</option>
							<option value="Guadalupe">Guadalupe</option>
							<option value="Guam">Guam</option>
							<option value="Guatemala">Guatemala</option>
							<option value="Guernesei">Guernesei</option>
							<option value="Guiana">Guiana</option>
							<option value="Guiana Francesa">Guiana Francesa</option>
							<option value="Guiné">Guiné</option>
							<option value="Guiné Equatorial">Guiné Equatorial</option>
							<option value="Guiné-Bissau">Guiné-Bissau</option>
							<option value="Gâmbia">Gâmbia</option>
							<option value="Haiti">Haiti</option>
							<option value="Honduras">Honduras</option>
							<option value="Hong Kong">Hong Kong</option>
							<option value="Hungria">Hungria</option>
							<option value="Ilha Bouvet">Ilha Bouvet</option>
							<option value="Ilha de Man">Ilha de Man</option>
							<option value="Ilha do Natal">Ilha do Natal</option>
							<option value="Ilha Heard e Ilhas McDonald">Ilha Heard e Ilhas McDonald</option>
							<option value="Ilha Norfolk">Ilha Norfolk</option>
							<option value="Ilhas Cayman">Ilhas Cayman</option>
							<option value="Ilhas Cocos (Keeling)">Ilhas Cocos (Keeling)</option>
							<option value="Ilhas Cook">Ilhas Cook</option>
							<option value="Ilhas Feroé">Ilhas Feroé</option>
							<option value="Ilhas Geórgia do Sul e Sandwich do Sul">Ilhas Geórgia do Sul e Sandwich do Sul</option>
							<option value="Ilhas Malvinas">Ilhas Malvinas</option>
							<option value="Ilhas Marshall">Ilhas Marshall</option>
							<option value="Ilhas Menores Distantes dos Estados Unidos">Ilhas Menores Distantes dos Estados Unidos</option>
							<option value="Ilhas Salomão">Ilhas Salomão</option>
							<option value="Ilhas Virgens Americanas">Ilhas Virgens Americanas</option>
							<option value="Ilhas Virgens Britânicas">Ilhas Virgens Britânicas</option>
							<option value="Ilhas Åland">Ilhas Åland</option>
							<option value="Indonésia">Indonésia</option>
							<option value="Inglaterra">Inglaterra</option>
							<option value="Índia">Índia</option>
							<option value="Iraque">Iraque</option>
							<option value="Irlanda do Norte">Irlanda do Norte</option>
							<option value="Irlanda">Irlanda</option>
							<option value="Irã">Irã</option>
							<option value="Islândia">Islândia</option>
							<option value="Israel">Israel</option>
							<option value="Itália">Itália</option>
							<option value="Iêmen">Iêmen</option>
							<option value="Jamaica">Jamaica</option>
							<option value="Japão">Japão</option>
							<option value="Jersey">Jersey</option>
							<option value="Jordânia">Jordânia</option>
							<option value="Kiribati">Kiribati</option>
							<option value="Kuwait">Kuwait</option>
							<option value="Laos">Laos</option>
							<option value="Lesoto">Lesoto</option>
							<option value="Letônia">Letônia</option>
							<option value="Libéria">Libéria</option>
							<option value="Liechtenstein">Liechtenstein</option>
							<option value="Lituânia">Lituânia</option>
							<option value="Luxemburgo">Luxemburgo</option>
							<option value="Líbano">Líbano</option>
							<option value="Líbia">Líbia</option>
							<option value="Macau">Macau</option>
							<option value="Macedônia">Macedônia</option>
							<option value="Madagáscar">Madagáscar</option>
							<option value="Malawi">Malawi</option>
							<option value="Maldivas">Maldivas</option>
							<option value="Mali">Mali</option>
							<option value="Malta">Malta</option>
							<option value="Malásia">Malásia</option>
							<option value="Marianas Setentrionais">Marianas Setentrionais</option>
							<option value="Marrocos">Marrocos</option>
							<option value="Martinica">Martinica</option>
							<option value="Mauritânia">Mauritânia</option>
							<option value="Maurícia">Maurícia</option>
							<option value="Mayotte">Mayotte</option>
							<option value="Moldávia">Moldávia</option>
							<option value="Mongólia">Mongólia</option>
							<option value="Montenegro">Montenegro</option>
							<option value="Montserrat">Montserrat</option>
							<option value="Moçambique">Moçambique</option>
							<option value="Myanmar">Myanmar</option>
							<option value="México">México</option>
							<option value="Mônaco">Mônaco</option>
							<option value="Namíbia">Namíbia</option>
							<option value="Nauru">Nauru</option>
							<option value="Nepal">Nepal</option>
							<option value="Nicarágua">Nicarágua</option>
							<option value="Nigéria">Nigéria</option>
							<option value="Niue">Niue</option>
							<option value="Noruega">Noruega</option>
							<option value="Nova Caledônia">Nova Caledônia</option>
							<option value="Nova Zelândia">Nova Zelândia</option>
							<option value="Níger">Níger</option>
							<option value="Omã">Omã</option>
							<option value="Palau">Palau</option>
							<option value="Palestina">Palestina</option>
							<option value="Panamá">Panamá</option>
							<option value="Papua-Nova Guiné">Papua-Nova Guiné</option>
							<option value="Paquistão">Paquistão</option>
							<option value="Paraguai">Paraguai</option>
							<option value="País de Gales">País de Gales</option>
							<option value="Países Baixos">Países Baixos</option>
							<option value="Peru">Peru</option>
							<option value="Pitcairn">Pitcairn</option>
							<option value="Polinésia Francesa">Polinésia Francesa</option>
							<option value="Polônia">Polônia</option>
							<option value="Porto Rico">Porto Rico</option>
							<option value="Portugal">Portugal</option>
							<option value="Quirguistão">Quirguistão</option>
							<option value="Quênia">Quênia</option>
							<option value="Reino Unido">Reino Unido</option>
							<option value="República Centro-Africana">República Centro-Africana</option>
							<option value="República Checa">República Checa</option>
							<option value="República Democrática do Congo">República Democrática do Congo</option>
							<option value="República do Congo">República do Congo</option>
							<option value="República Dominicana">República Dominicana</option>
							<option value="Reunião">Reunião</option>
							<option value="Romênia">Romênia</option>
							<option value="Ruanda">Ruanda</option>
							<option value="Rússia">Rússia</option>
							<option value="Saara Ocidental">Saara Ocidental</option>
							<option value="Saint Martin">Saint Martin</option>
							<option value="Saint-Barthélemy">Saint-Barthélemy</option>
							<option value="Saint-Pierre e Miquelon">Saint-Pierre e Miquelon</option>
							<option value="Samoa Americana">Samoa Americana</option>
							<option value="Samoa">Samoa</option>
							<option value="Santa Helena, Ascensão e Tristão da Cunha">Santa Helena, Ascensão e Tristão da Cunha</option>
							<option value="Santa Lúcia">Santa Lúcia</option>
							<option value="Senegal">Senegal</option>
							<option value="Serra Leoa">Serra Leoa</option>
							<option value="Seychelles">Seychelles</option>
							<option value="Singapura">Singapura</option>
							<option value="Somália">Somália</option>
							<option value="Sri Lanka">Sri Lanka</option>
							<option value="Suazilândia">Suazilândia</option>
							<option value="Sudão">Sudão</option>
							<option value="Suriname">Suriname</option>
							<option value="Suécia">Suécia</option>
							<option value="Suíça">Suíça</option>
							<option value="Svalbard e Jan Mayen">Svalbard e Jan Mayen</option>
							<option value="São Cristóvão e Nevis">São Cristóvão e Nevis</option>
							<option value="São Marino">São Marino</option>
							<option value="São Tomé e Príncipe">São Tomé e Príncipe</option>
							<option value="São Vicente e Granadinas">São Vicente e Granadinas</option>
							<option value="Sérvia">Sérvia</option>
							<option value="Síria">Síria</option>
							<option value="Tadjiquistão">Tadjiquistão</option>
							<option value="Tailândia">Tailândia</option>
							<option value="Taiwan">Taiwan</option>
							<option value="Tanzânia">Tanzânia</option>
							<option value="Terras Austrais e Antárticas Francesas">Terras Austrais e Antárticas Francesas</option>
							<option value="Território Britânico do Oceano Índico">Território Britânico do Oceano Índico</option>
							<option value="Timor-Leste">Timor-Leste</option>
							<option value="Togo">Togo</option>
							<option value="Tonga">Tonga</option>
							<option value="Toquelau">Toquelau</option>
							<option value="Trinidad e Tobago">Trinidad e Tobago</option>
							<option value="Tunísia">Tunísia</option>
							<option value="Turcas e Caicos">Turcas e Caicos</option>
							<option value="Turquemenistão">Turquemenistão</option>
							<option value="Turquia">Turquia</option>
							<option value="Tuvalu">Tuvalu</option>
							<option value="Ucrânia">Ucrânia</option>
							<option value="Uganda">Uganda</option>
							<option value="Uruguai">Uruguai</option>
							<option value="Uzbequistão">Uzbequistão</option>
							<option value="Vanuatu">Vanuatu</option>
							<option value="Vaticano">Vaticano</option>
							<option value="Venezuela">Venezuela</option>
							<option value="Vietname">Vietname</option>
							<option value="Wallis e Futuna">Wallis e Futuna</option>
							<option value="Zimbabwe">Zimbabwe</option>
							<option value="Zâmbia">Zâmbia</option>
						</select>
				</div>	
				
				
				-->