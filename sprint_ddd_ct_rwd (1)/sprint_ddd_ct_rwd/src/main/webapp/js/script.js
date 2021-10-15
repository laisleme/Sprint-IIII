function validarDadosCpf() {
    var nome = idTxtName.value;
    var cpf = idNumCpf.value;
    var email = idTxtEmail.value;
    var idade = idIdade.value;
    var telefone = idNumTelefone.value;
    var rua = idRua.value;
    var cep = idCep.value;
    var cidade = idCidade.value;
    var numero = idNumero.value;
    var bairro = idBairro.value;
    var estado = idSelEstados.value;
    var pais = idSelPaises.value;

    if (!nome) {
        alert('Por favor, preencha o campo Nome.');
    }

    if (!email) {
        alert('Por favor, preencha o campo E-mail.');
    }
    if (!cpf) {
        alert('Por favor, preencha o campo Cpf.');
    }

    if (!idade) {
        alert('Por favor, preencha o campo Idade.');
    }

    if (!telefone) {
        alert('Por favor, preencha o campo Telefone.');
    }
    if (!rua) {
        alert('Por favor, preencha o campo Rua.');
    }

    if (!cep) {
        alert('Por favor, preencha o campo Cep.');
    }

    if (!cidade) {
        alert('Por favor, preencha o campo Cidade.');
    }
    if (!numero) {
        alert('Por favor, preencha o campo Numero.');
    }
    if (!bairro) {
        alert('Por favor, preencha o campo Bairro.');
    }
    if (!estado) {
        alert('Por favor, preencha o campo Estado.');
    }
    if (!pais) {
        alert('Por favor, preencha o campo Pais.');
    }

    if (nome && email && cpf && idade && telefone && rua && cep && cidade && numero && bairro && estado && pais) {
        window.location.href = 'portal.html';
    }
}
function validarDadosCnpj() {
    var razaoSocial = idTxtName.value;
    var cnpj = idNumCnpj.value;
    var nomeFantasia = idTxtNameF.value;
    var email = idTxtEmail.value;
    var idade = idIdade.value;
    var telefone = idNumTelefone.value;
    var rua = idRua.value;
    var cep = idCep.value;
    var cidade = idCidade.value;
    var numero = idNumero.value;
    var bairro = idBairro.value;
    var estado = idSelEstados.value;
    var pais = idSelPaises.value;

    if (!razaoSocial) {
        alert('Por favor, preencha o campo Razão Social.');
    }

    if (!nomeFantasia) {
        alert('Por favor, preencha o campo Nome Fantasia.');
    }

    if (!cnpj) {
        alert('Por favor, preencha o campo Cnpj.');
    }

    if (!email) {
        alert('Por favor, preencha o campo E-mail.');
    }

    if (!idade) {
        alert('Por favor, preencha o campo Idade.');
    }

    if (!telefone) {
        alert('Por favor, preencha o campo Telefone.');
    }
    if (!rua) {
        alert('Por favor, preencha o campo Rua.');
    }

    if (!cep) {
        alert('Por favor, preencha o campo Cep.');
    }

    if (!cidade) {
        alert('Por favor, preencha o campo Cidade.');
    }
    if (!numero) {
        alert('Por favor, preencha o campo Numero.');
    }
    if (!bairro) {
        alert('Por favor, preencha o campo Bairro.');
    }
    if (!estado) {
        alert('Por favor, preencha o campo Estado.');
    }
    if (!pais) {
        alert('Por favor, preencha o campo Pais.');
    }


    if (razaoSocial && nomeFantasia && cnpj && email && idade && telefone && rua && cep && cidade && numero && bairro && estado && pais) {
        window.location.href = 'portal.html';
    }
}
function ExibirDadosCNPJ(idTxtName,idTxtNameF,idNumCnpj,idTxtEmail,idIdade,idNumTelefone,
                    idRua,idCep,idCidade,idNumero,idComp,idBairro,idSelEstados,idSelPaises){
    alert("Razão Social: " + idTxtName + "\n" + "Nome Fantasia: "+ idTxtNameF +"\n"+
    "CNPJ: "+  idNumCnpj +"\n" +"E-mail: "+ idTxtEmail +"\n" +"Idade da Empresa: "+ idIdade +"\n" +
    "Número: "+ idNumTelefone +"\n" +"Rua: "+ idRua +"\n" +"CEP: "+ idCep +"\n" +"Cidade: "+ idCidade +"\n" +
    "Número Endereço: "+ idNumero +"\n" +"Complemento: "+ idComp +"\n" +"Bairro: "+ idBairro +"\n" +"Estado: "+ idSelEstados +"\n"+
    "País: "+ idSelPaises);
}

function ExibirDadosCPF(idTxtName,idNumCpf,idTxtEmail,idIdade,idNumTelefone,
                    idRua,idCep,idCidade,idNumero,idComp,idBairro,idSelEstados,idSelPaises){
alert("Nome: " + idTxtName + "\n" +
"CPF: "+  idNumCpf +"\n" +"E-mail: "+ idTxtEmail +"\n" +"Idade: "+ idIdade +"\n" +
"Número: "+ idNumTelefone +"\n" +"Rua: "+ idRua +"\n" +"CEP: "+ idCep +"\n" +"Cidade: "+ idCidade +"\n" +
"Número Endereço: "+ idNumero +"\n" +"Complemento: "+ idComp +"\n" +"Bairro: "+ idBairro +"\n" +"Estado: "+ idSelEstados +"\n"+
"País: "+ idSelPaises);
}

function mensagemBemVindo(){
    alert("Bem-vindo ao portal")
}

function validarCPF(idNumCpf) {
   
	var Soma;
    var Resto;
    Soma = 0;
	resultadoInvalido = "";
	if (idNumCpf == "00000000000")
	{
		Alert("CPF é inválido, pois está preenchido com 00000000000");
		resultadoInvalido = "inválido";
		exit();
	}
     
	for (i=1; i<=9; i++) 
	{
		Soma = Soma + parseInt(idNumCpf.substring(i-1, i)) * (11 - i);
		
	}
	Resto = (Soma * 10) % 11;
		
    if ((Resto == 10) || (Resto == 11))  
	{
		Resto = 0;
    }
	
	if (Resto != parseInt(idNumCpf.substring(9, 10)) ) //return false;
	{
		alert("O número do CPF é inválido");
		resultadoInvalido = "inválido";
		exit();
	}
   
	Soma = 0;
    for (i = 1; i <= 10; i++){
	Soma = Soma + parseInt(idNumCpf.substring(i-1, i)) * (12 - i);
    }
	Resto = (Soma * 10) % 11;
   
    if ((Resto == 10) || (Resto == 11))
	{
		Resto = 0;
	}
	
    if (Resto != parseInt(idNumCpf.substring(10, 11) ) ) //return false;
    {
		alert("O número do CPF é inválido");
		resultadoInvalido = "inválido";
		exit();
	}
	if (resultadoInvalido != "inválido")
	{
		alert("O número do CPF é VÁLIDO");//return true;
		exit();
	}
}

