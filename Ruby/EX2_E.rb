puts "Digite um nome"
nome = gets.chomp
puts "Digite o sexo"
puts "m: Masculino"
puts "f: feminino"
sexo = gets.chomp
if sexo == 'm' or sexo == 'f'
  puts 'Sexo valido'
    if sexo =='m'
      puts "Ilmo Sr.", nome
    else
      puts "Ilma. Sra.", nome
    end
else
  puts 'Sexo informado invalido'
end