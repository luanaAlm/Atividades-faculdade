puts "Digite um número"
n = gets.to_i
if n < 0
  mult = n * (-1)
  puts mult, "Agora é positivo"
else
  puts "Número inteiro positivo"
end

