
soma = 0
i = 1

for i in range(3):
    notas = int(input(f"Digite a {i+1}ª nota: "))
    soma += notas

media = soma / 3

print(f'A média foi: {media}')

if media >= 10:
    print('aprovado')
else:
    print('reprovado')
