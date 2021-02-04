puts "Digite o valor da distância"
distancia = gets.chomp.to_i
puts "Digite o valor do tempo"
tempo = gets.chomp.to_i
velocidade = (distancia *1000) / (tempo * 60)
puts "O valor em m/s é: ", velocidade
