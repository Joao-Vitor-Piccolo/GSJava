Documentação do projeto — SentinelaDengue
Transcrição textual do PDF original (25 páginas). A diagramação foi adaptada para Markdown. Diagramas, telas e imagens foram indicados como elementos visuais, não reproduzidos como imagens.

Página 1
FIAP · GLOBAL SOLUTION 2026.2

Documentação do projeto
SentinelaDengue · vigilância participativa da dengue no bairro

Agile Methodology With Squad Framework
Novembro de 2026

INTEGRANTES

Gabrielle Calazans RM 564460
Jéssica Domingues RM 562973
João Vitor Piccolo RM 565127
Kauã Carvalho de Oliveira RM 566371

Leonardo Pereira RM 561349

Vídeo pitch (YouTube, não listado): (xxxxxxxx)
Página 2
1. Entregável 1 — Apresentação descritiva da
   ideia
O Sentinela é uma plataforma de vigilância participativa de bairro: junta sentinelas de
monitoramento, dados públicos e autovistorias dos moradores para transformar risco em tarefas
concretas para morador, agente e gestor, antes do pico de casos previsto para 2027.

1.1 Contextualização do problema
● 2026 foi um ano de queda. Até 26 de setembro, o país teve 470,5 mil casos prováveis de
dengue, contra 1,5 milhão no mesmo período de 2025 (Brasil 61/MS).
● 2027 tende a ser pior. Em julho de 2026, o Ministério da Saúde alertou estados e municípios
para a possibilidade de cerca de 1,7 milhão de casos em 2027, ressalvando que a projeção
depende de cenários climáticos (Metrópoles).
● O clima empurra o risco. A NOAA estima probabilidade igual ou superior a 90% de um El Niño
muito forte nos próximos trimestres (INMET, 14/08/2026).
● O vetor continua presente. No 2º ciclo do LIRAa de 2026, 49,2% dos 3.732 municípios que
enviaram dados ficaram em alerta ou risco (A Crítica/MS).

1.2 Problema central
No bairro, os sinais de risco chegam ao gestor, mas não viram ação dentro das casas, onde está a
maioria dos criadouros e onde o agente muitas vezes não consegue entrar.

Três fatos sustentam essa frase:
1.   Mais de 70% dos criadouros estão no interior das casas, segundo o Ministério da Saúde
     (Agência Gov).
2.   A visita do agente falha em parte dos imóveis: cerca de 20% estavam fechados em Campo
     Mourão (PR) (Brasil 61), e a pendência chegou a 45–47% em Caraguatatuba (SP), cidade de
     veraneio (Brasil 61).
3.   Os avisos que chegam ao morador são gerais, uma campanha igual para a cidade inteira.
     Eles não dizem o que olhar na própria casa nem devolvem o resultado do que foi feito.
1.3 Justificativa da escolha do problema
● Urgência com data: a temporada 2026/2027 combina El Niño muito forte e alerta oficial de
alta. Há uma janela de preparo agora, antes do verão.
Página 3
● Problema visível de perto: quintais, calhas, pratos de planta e caixas d'água estão na casa
de qualquer integrante do grupo. Dá para observar e entrevistar, como o briefing pede.
● Oportunidade clara: o elo fraco da prevenção é a última etapa, a ação dentro do imóvel e o
retorno dessa ação para quem decide. É aí que o SentinelaDengue atua.
● Território: Osasco/SP, bairro a definir pela equipe (recomendação: um bairro onde alguém
do grupo more ou tenha família, para viabilizar a etapa "Observar").

1.4 Público-alvo
Perfil                               Papel no sistema                         Por que é público-alvo

 Morador de bairro com                Usuário principal: recebe alerta, faz    É quem tem acesso diário aos
histórico de infestação              autovistoria, reporta focos, agenda      criadouros dentro de casa
visita

 Agente de combate às                 Usuário operacional: recebe              Faz a vistoria e o controle vetorial
endemias (ACE)                       prioridades, valida relatos, registra    no território
visitas

 Coordenação de vigilância em         Usuário decisor e dono das               Define onde agir e presta contas
saúde ambiental do município         sentinelas                               dos resultados

 Público secundário: idosos e         Recebe alertas por WhatsApp/SMS,         Grupo de maior risco de
pessoas com pouca                    sem instalar app                         agravamento, com menor
familiaridade digital                                                         acesso a apps

O agente comunitário de saúde (ACS) não é usuário direto no MVP: ele pode divulgar o canal nas
visitas da UBS, mas não opera o sistema.

1.5 Necessidades e dificuldades dos usuários
Perfil        Necessidade                               Dificuldade hoje

 Morador       Saber quando redobrar o cuidado e         Campanhas genéricas sem relevância local; ninguém
o que olhar primeiro na própria casa      em casa no horário da visita

 ACE           Saber onde ir primeiro e entrar nas       Muitos imóveis, pendências de casas fechadas e
casas certas                              recusas, relatos de cidadãos sem triagem

 Gestor        Antecipar ações e justificar a            Números da cidade inteira e levantamentos por ciclo,
alocação de equipes                       pouca visão de quarteirão e pouca medida do
resultado das ações

1.6 Limitações do modelo atual de prevenção
● A visita casa a casa depende de encontrar o morador. Imóveis fechados e recusas viram
pendência e exigem retornos (ver 1.2).
Página 4
● O retrato da infestação chega tarde. O levantamento é por amostragem e sai em ciclos de
meses: o 2º ciclo de 2026 cobriu maio a agosto (A Crítica/MS). Quando o resultado chega, o
cenário pode ter mudado.
● A comunicação é igual para todos. O morador não sabe o que olhar primeiro na própria
casa nem vê o efeito do que fez.
● O relato do cidadão é impreciso e não tem retorno. A denúncia chega sem local exato e o
morador não sabe o que aconteceu com ela.
● O resultado das ações é difícil de medir por quarteirão, o que dificulta decidir onde reforçar
as equipes.

1.7 Proposta de solução
O SentinelaDengue trabalha em um ciclo semanal, por bairro:
1.   Sinal: o sistema calcula o risco de cada área com três entradas: leituras das sentinelas
     (contagem de ovos, nível de água, temperatura e umidade), relatos e autovistorias dos
     moradores, e dados públicos de clima e casos.
2.   Tarefa: quando o risco sobe, o morador recebe um alerta com um checklist de autovistoria
     de 10 minutos, focado nos criadouros mais comuns daquele bairro. O agente recebe a lista
     de quarteirões prioritários e as pendências.
3.   Ação comprovada: o morador marca o que encontrou e eliminou, ou agenda a visita do
     agente num horário em que estará em casa. O agente confirma relatos e registra a visita.
4. Aprendizado: o gestor vê no painel o risco, as ações feitas e o efeito na semana seguinte, e
     ajusta limites e prioridades.

                           Ciclo semanal do SentinelaDengue · 4 etapas, 3 entradas
O sistema não termina no alerta: o que o morador e o agente fazem volta como dado e muda o
índice da semana seguinte.
Página 5
1.8 Diferenciais e inovação
O diferencial do Sentinela é transformar o risco do bairro em uma tarefa concreta dentro de cada
casa e trazer o resultado dessa tarefa de volta como dado. Sete elementos sustentam isso:
● Autovistoria guiada: o morador vira os olhos do sistema dentro de casa. O checklist muda
     conforme os criadouros que mais aparecem no bairro, e cada resposta vira dado ("2 pratos
     de planta com água, eliminados").
● Agendamento de visita: o morador escolhe quando estará em casa, o que reduz as
     pendências de imóveis fechados.
● Triagem de relatos pelo agente: o relato só entra no cálculo de risco depois de confirmado, o
     que evita denúncias falsas e dá retorno ao morador.
● Risco explicável e acionável: cada cor vem com o motivo (por exemplo, ovos acima do
     limite + chuva acumulada) e com uma tarefa para quem pode agir.
● Sentinela de bairro com anfitrião: a medição acontece no próprio território, numa casa ou
     escola parceira, com manutenção semanal pelo agente.
● Retorno ao morador: "seu quarteirão eliminou 14 focos esta semana; o risco caiu para
     amarelo".
● Canal inclusivo: alerta pelo app e, para quem não usa app, por WhatsApp ou SMS.
1.9 Como a participação cidadã melhora a prevenção
A participação funciona quando é curta, recorrente e tem retorno. Por isso o sistema pede uma
tarefa de 10 minutos, só quando o risco do bairro sobe, e devolve ao morador o resultado: "seu
quarteirão eliminou 14 focos esta semana; o risco caiu para amarelo". O morador também pode se
oferecer como anfitrião de uma sentinela.

1.10 Como os dados viram ações concretas
Sinal                            Regra (exemplo, a calibrar)      Ação gerada

 Sentinela com ovos acima         Risco do quarteirão sobe um      Alerta + checklist aos moradores num
do limite por 2 semanas          nível                            raio definido pelo gestor; quarteirão
entra na lista do agente

 Relato confirmado de foco        Quarteirão marcado como "foco    Visita prioritária; retorno ao morador que
ativo"                           relatou

 Imóvel com pendência             Morador recebe convite para      Visita no horário escolhido
agendar

 Previsão de calor e chuva        Limites de alerta ficam mais     Gestor antecipa mutirão no bairro
acima da média                   sensíveis
Página 6
Os limites são configuráveis pelo gestor e devem partir dos índices que a vigilância do município já
usa, como o Índice de Positividade de Ovitrampas (percentual de sentinelas com ovos). No protótipo,
os valores de corte são simulados e declarados como tal.

1.11 Justificativa das tecnologias
Tecnologia                               Por que esta                                  Alternativa descartada

 App web responsivo (PWA)                 Abre no navegador, sem instalar;              App nativo: barreira de
funciona em celular simples                   instalação

 WhatsApp/SMS para alertas                Alcança idosos e quem não instala             Só push no app: exclui o
apps                                          público mais vulnerável

 Sentinela: ovitrampa com sensores        O briefing aceita circuito no simulador       Câmera com IA já no MVP:
(nível de água, temperatura,             e dados simulados; ovos são indicador         hardware complexo para
umidade) e contagem de ovos,             consagrado                                    o prazo; fica para a versão
simulada em circuito                                                                   2

 API REST em Java (Spring Boot) +         Atende DDD e Database Design com o            —
Oracle                                   mesmo domínio

 Regressão logística (Python) para        Explicável e testável com dados               Redes neurais: caixa-
o índice de risco                        públicos; atende Data Science                 preta, poucos dados
locais

 Grafos e programação dinâmica            Atende Dynamic Programming e                  —
para rota e prioridade de visitas        resolve um problema real do agente

 Assistente de IA generativa              Tira dúvidas em linguagem simples             Diagnóstico médico: fora
(Should)                                                                               do escopo e arriscado

1.12 Benefícios esperados
● Morador: saber o que fazer e quando, em poucos minutos, e acompanhar o efeito no
quarteirão.
● Agente: menos tempo em imóveis sem risco e menos retornos a casas fechadas.
● Gestor: decisão por quarteirão, com justificativa e medida de resultado.

1.13 Impacto social e indicadores
O impacto deve ser medido com indicadores que o próprio sistema registra:

 Indicador                                       Cálculo                                                   ODS

 Focos eliminados por autovistoria               Itens marcados "eliminado" por semana e bairro            3, 11

 Taxa de pendência                               Imóveis fechados / imóveis visitados                      3, 11

 Tempo de resposta                               Horas entre o relato e a confirmação pelo agente          3
Página 7
Indicador                                       Cálculo                                                    ODS

 Adesão                                          Moradores que concluíram a autovistoria / alertas          10, 11
enviados

 Antecipação                                     Dias entre o primeiro alerta do bairro e o pico de casos   3, 13

 Equidade                                        Adesão nos bairros de menor renda comparada à              10
média

ODS conectados: ODS 3 (Saúde e bem-estar), ao reduzir casos evitáveis; ODS 10 (Redução das
desigualdades), com canal por WhatsApp/SMS e prioridade a áreas vulneráveis; ODS 11 (Cidades e
comunidades sustentáveis), com participação do morador no cuidado do território; ODS 13 (Ação
contra a mudança do clima), ao adaptar a resposta a um El Niño muito forte; ODS 9 (Indústria,
inovação e infraestrutura), com vigilância por sensores.

Limites éticos: o sistema orienta, mas não diagnostica: quem tem sintomas é orientado a procurar a
UBS. Os dados de pessoas ficam agregados por quarteirão e semana; o protótipo usa apenas dados
simulados ou públicos, como o briefing exige.
2. Entregável 2 — Personas
Três personas interagem diretamente com o sistema (Camila, Rafael e Marcos); Dona Lúcia é
secundária e existe para garantir acessibilidade. Cada persona traz a evidência que a sustenta e o
que ainda precisa ser confirmado em entrevista.

2.1 Camila, 31 — a moradora que nunca está em casa na hora da visita
(principal)
Um dia de Camila. Camila sai às 6h30 para trabalhar como operadora de caixa num supermercado
em São Paulo e volta perto das 19h. Os dois filhos, de 6 e 9 anos, ficam na escola e depois com a avó.
Em março, encontrou um aviso do agente de endemias na porta: "imóvel fechado, retornaremos". Ele
não voltou num horário em que ela estivesse. No fim de semana, ela até limpa o quintal, mas não
sabe se a calha, a caixa d'água e os vasos da sogra contam.

 Campo                                       Descrição

 Ocupação                                    Operadora de caixa, jornada de 44 horas semanais

 Contexto socioeconômico                     Mora em casa com quintal em Osasco/SP, com marido, filhos e
sogra; renda familiar apertada; plano de celular pré-pago

 Objetivos                                   Proteger os filhos da dengue sem perder um dia de trabalho
Página 8
Campo                                       Descrição

 Necessidades                                Saber quando o risco do bairro subiu e exatamente o que checar,
em poucos minutos e fora do horário comercial

 Dores                                       Recebe avisos genéricos; não está em casa no horário da visita;
não sabe se fez o suficiente

 Comportamentos                              Resolve tudo pelo WhatsApp no transporte; age quando a
mensagem é curta e prática; ignora panfletos

 Relação com a tecnologia                    Celular Android intermediário com pouco espaço; evita instalar
apps; usa links e formulários simples

 Como a solução ajuda                        Recebe o alerta do bairro no WhatsApp, abre o checklist de 10
minutos no domingo, marca o que eliminou e agenda a visita do
agente para sábado de manhã

 Evidência que sustenta                      Mais de 70% dos criadouros ficam dentro das casas (Agência
Gov); agentes relatam que muitos moradores trabalham ou
estudam no horário da visita (Brasil 61)

 A validar na entrevista                     Ela aceitaria agendar uma visita? Qual dia e horário funcionam?
Ela responderia a um checklist pelo WhatsApp?

2.2 Rafael, 38 — o agente de combate às endemias que precisa
escolher onde ir primeiro (principal)
Um dia de Rafael. Rafael é agente de combate às endemias (ACE) da prefeitura há 12 anos. Começa
o dia com a lista de quarteirões do ciclo e um boletim de campo. Em boa parte das portas não há
ninguém; em outras, o morador recusa a entrada por medo de golpes ou de violência. Os relatos de
cidadãos chegam pelo telefone 156 sem foto nem local exato, e ele perde tempo em endereços
onde não há foco.

 Campo                                       Descrição

 Ocupação                                    Agente de combate às endemias, servidor municipal, trabalho de
campo diário

 Contexto socioeconômico                     Mora no mesmo município; usa o próprio celular no trabalho;
conhece bem o território e os moradores mais antigos

 Objetivos                                   Eliminar o maior número de focos com o tempo que tem, e
mostrar o resultado do trabalho

 Necessidades                                Lista priorizada de quarteirões; relatos já com local e tipo de foco;
saber quem vai estar em casa e quando

 Dores                                       Pendências de casas fechadas que exigem retornos; recusas;
relatos imprecisos; trabalho invisível para a gestão
Página 9
Campo                                       Descrição

 Comportamentos                              Planeja a rota de manhã; registra tudo em papel e depois digita;
confia mais no que vê do que em mapas

 Relação com a tecnologia                    Usa WhatsApp e apps de mapa com facilidade; desconfia de
sistemas que aumentam a digitação sem devolver nada

 Como a solução ajuda                        Abre a lista do dia já ordenada por risco, vê os relatos com local,
confirma ou descarta cada um em dois toques e encontra as
visitas agendadas no horário certo

 Evidência que sustenta                      Boletins de campo registram imóvel fechado, recusa e pendência
como situações padrão (CVE-SP); há relato de recusa por medo
da violência (Brasil 61)

 A validar na entrevista                     Como a rota é definida hoje? O agente usa celular do serviço ou
o próprio? Quanto tempo gasta em retornos?

2.3 Marcos, 45 — o gestor que precisa agir antes do pico e justificar a
decisão (principal)
Um dia de Marcos. Marcos coordena a Vigilância em Saúde Ambiental do município. Toda semana
recebe números da cidade inteira e, de tempos em tempos, o levantamento de infestação do ciclo.
Com a notícia do El Niño, o secretário quer saber onde colocar as equipes extras em dezembro.
Marcos tem números da cidade, mas não sabe quais quarteirões estão piorando nem se as ações
da semana passada funcionaram.

 Campo                                       Descrição

 Ocupação                                    Coordenador de vigilância em saúde ambiental, servidor de
carreira

 Contexto socioeconômico                     Equipe e orçamento limitados; responde ao secretário de saúde,
à imprensa e aos órgãos de controle

 Objetivos                                   Antecipar ações nas áreas certas e prestar contas com dados

 Necessidades                                Risco por bairro e quarteirão, com motivo; visão das ações feitas;
relatório pronto para reunião

 Dores                                       Dados chegam por ciclo ou por município; pouca medida de
resultado; dificuldade de justificar a redistribuição de equipes

 Comportamentos                              Decide em reuniões semanais; usa planilhas; precisa de números
que possa defender

 Relação com a tecnologia                    Usa computador no escritório e o celular fora dele; aceita painéis,
mas desconfia de "caixa-preta"
Página 10
Campo                                       Descrição

 Como a solução ajuda                        Vê no painel os quarteirões que mudaram de cor, o motivo de
cada mudança e quantos focos os moradores e agentes
eliminaram; ajusta os limites de alerta e exporta o relatório

 Evidência que sustenta                      O Ministério da Saúde pediu reforço da vigilância por causa do El
Niño (Metrópoles); o levantamento de infestação sai por ciclos de
meses (A Crítica/MS)

 A validar na entrevista                     Que decisões ele toma por semana? Que indicador o secretário
cobra? O município já usa ovitrampas?

2.4 Quem ficou de fora e por quê
● Agente comunitário de saúde (ACS): divulga o canal nas visitas da UBS, mas não opera o
sistema no MVP.
● Escolas e comércio: podem ser anfitriões de sentinelas no futuro; não têm fluxo próprio
agora.
3. Entregável 3 — Diagrama de Casos de Uso
O escopo total tem 26 casos de uso, quatro atores humanos, dois sistemas externos e um
dispositivo. Os 11 casos destacados formam o MVP, e todo caso de uso tem pelo menos uma história
no backlog (seção 4).
Página 11
Elemento visual no PDF: diagrama/telas do protótipo. A imagem original não foi convertida em texto.

Diagrama de casos de uso do SentinelaDengue (UML 2.x) · visão completa, com o MVP destacado

O UC20 Calcular índice de risco é o centro do sistema: ele é incluído pela consulta do morador
(UC02), pela lista do agente (UC11) e pelo painel do gestor (UC21), então os três perfis veem o mesmo
número com o mesmo motivo.
Página 12
3.1 Atores
Ator                        Tipo                      Quem representa

 Morador                     Humano, principal         Camila (persona 2.1); Dona Lúcia acessa pelo canal
WhatsApp/SMS

 Agente de endemias          Humano, principal         Rafael (persona 2.2)

 Gestor da vigilância        Humano, principal         Marcos (persona 2.3)

 Administrador               Humano, de suporte        Equipe de TI da prefeitura

 Sentinela                   Dispositivo               Ovitrampa monitorada com sensores, simulada em
circuito

 Dados públicos (clima       Sistema externo           Fontes públicas de casos e clima
e casos)

 WhatsApp/SMS                Sistema externo           Canal de envio de alertas para quem não usa o app

3.2 Casos de uso e rastreabilidade
Código      Caso de uso                Ator                O que faz                            Histórias

 UC01        Receber alerta de          Morador,            Recebe aviso quando o risco do       H03, H08
risco                      WhatsApp/SMS        quarteirão sobe

 UC02        Consultar risco do         Morador             Vê o nível e o motivo; inclui UC20   H02
bairro

 UC03        Cadastrar endereço         Morador             Liga o morador a um quarteirão       H01

 UC04        Fazer autovistoria         Morador             Checklist de até 10 minutos          H04
guiada

 UC05        Reportar foco              Morador             Relato com local e tipo; estende     H05
UC04

 UC06        Agendar visita do          Morador             Escolhe janela em que estará em      H06
agente                                         casa

 UC07        Acompanhar retorno         Morador             Vê o resultado do relato e do        H07
quarteirão

 UC08        Conversar com              Morador             Tira dúvidas de prevenção            H09
assistente

 UC09        Ser anfitrião de           Morador             Oferece o imóvel para uma            H10
sentinela                                      sentinela

 UC10        Encontrar UBS              Morador             Vê UBS e sinais de alerta            H11
próxima
Página 13
Código      Caso de uso                Ator             O que faz                                Histórias

 UC11        Ver áreas prioritárias     Agente           Lista de quarteirões por risco; inclui   H12
UC20

 UC12        Gerar rota de visita       Agente           Rota sugerida; estende UC11              H15

 UC13        Triar relato de foco       Agente           Confirma ou descarta relatos             H13

 UC14        Registrar visita           Agente           Situação do imóvel e focos               H14
tratados

 UC15        Gerenciar agenda           Agente           Vê as visitas agendadas                  H16

 UC16        Registrar                  Agente           Manutenção da sentinela                  H17
manutenção

 UC17        Importar dados             Dados públicos   Carga semanal de clima e casos           H20
públicos

 UC18        Enviar leitura             Sentinela        Ovos, nível de água, temperatura,        H18
umidade

 UC19        Enviar alerta de falha     Sentinela        Bateria, falta de água, sem leitura      H19

 UC20        Calcular índice de         (interno)        Índice explicável por quarteirão e       H21
risco                                       semana

 UC21        Ver painel de risco        Gestor           Mapa, sentinelas e ações; inclui         H22
UC20

 UC22        Configurar limites         Gestor           Ajusta a sensibilidade dos níveis        H23

 UC23        Gerenciar sentinelas       Gestor           Cadastro, status e anfitrião             H24

 UC24        Emitir comunicado          Gestor           Mensagem a um bairro (mutirão)           H25

 UC25        Gerar relatório de         Gestor           Indicadores para prestação de            H26
impacto                                     contas

 UC26        Gerenciar usuários e       Administrador    Perfis, acessos, bairros e               H27
áreas                                       quarteirões

3.3 Especificação dos dois casos de uso mais críticos

UC04 — Fazer autovistoria guiada
● Ator: Morador. Pré-condição: endereço cadastrado (UC03) e alerta recebido ou acesso
espontâneo.
● Fluxo principal:
a. O morador abre a autovistoria pelo link do alerta.
b. O sistema mostra o primeiro item do checklist, priorizado pelos criadouros mais
comuns no bairro.
Página 14
c.   O morador marca uma resposta: não tenho, tinha água e eliminei, ou tem foco e não
consigo eliminar.
d. O sistema avança até o último item (no máximo 8).
e. O sistema mostra o resumo e registra a autovistoria no quarteirão.
● Fluxo alternativo (extensão para UC05): no passo c, se o morador marca "não consigo
eliminar", o sistema oferece reportar o foco com o tipo já preenchido.
● Fluxo alternativo: se o morador sai no meio, as respostas dadas ficam salvas por 24 horas.
● Pós-condição: a autovistoria conta no indicador de adesão e os itens eliminados contam
como focos eliminados.

UC13 — Triar relato de foco
● Ator: Agente de endemias. Pré-condição: existe relato "aguardando triagem" na área do
agente.
● Fluxo principal:
a. O agente abre a lista de relatos pendentes, ordenada por risco do quarteirão.
b. O agente vai ao local e verifica o foco.
c.   O agente marca "confirmado" e registra o tratamento feito.
d. O sistema recalcula o risco do quarteirão na próxima execução de UC20 e avisa o
morador que relatou.
● Fluxo alternativo: no passo c, o agente marca "descartado" e escolhe o motivo; o relato não
entra no risco.
● Fluxo alternativo: imóvel fechado no passo b; o relato fica como pendência e o morador
recebe convite para agendar (UC06).
● Pós-condição: a foto do relato é apagada (RN06) e o tempo de resposta fica registrado.
4. Entregável 4 — Backlog do Produto
O backlog tem 30 histórias em 7 épicos, todas ligadas a um caso de uso do diagrama. O MVP são as
11 histórias Must, somando 47 story points: o ciclo risco → alerta → autovistoria → relato → triagem
→ visita → painel, com a sentinela simulada.

4.1 Épicos
Épico                             Objetivo                                 Histórias

 E1 Risco e alerta ao morador      O morador sabe quando e por que agir     H01, H02, H03, H08

 E2 Autovistoria e relatos         A ação dentro de casa vira dado          H04, H05, H07
Página 15
Épico                             Objetivo                                       Histórias

 E3 Visitas do agente              O agente vai primeiro aonde importa e entra    H06, H12, H13, H14, H15, H16
nas casas

 E4 Sentinelas e dados             O sistema recebe sinais do território          H17, H18, H19, H20, H21

 E5 Gestão e painel                O gestor decide e presta contas                H22, H23, H24, H25, H26

 E6 Apoio ao cidadão               Dúvidas e atendimento sem sair do canal        H09, H10, H11

 E7 Administração e evolução       Acesso controlado e itens futuros              H27, H28, H29, H30

4.2 Backlog priorizado (MoSCoW + story points)
ID       Caso de uso        História de usuário                                 MoSCoW           SP    MVP

 H01      UC03               Como moradora, quero cadastrar só meu               Must             2     Sim
endereço (rua e número, sem documentos), para
receber os alertas do meu quarteirão.

 H02      UC02               Como moradora, quero ver o nível de risco do        Must             3     Sim
meu bairro em cor e texto, para saber quando
redobrar os cuidados.

 H03      UC01               Como moradora, quero receber um alerta              Must             5     Sim
quando o risco do meu quarteirão subir, para
agir antes do surto.

 H04      UC04               Como moradora, quero fazer uma autovistoria         Must             5     Sim
guiada de até 10 minutos, para saber
exatamente o que checar em casa.

 H05      UC05               Como moradora, quero reportar um foco que           Must             3     Sim
não consigo eliminar, com local, tipo e foto
opcional, para que o agente seja avisado.

 H12      UC11               Como agente, quero ver os quarteirões               Must             5     Sim
ordenados por risco e o motivo de cada um, para
decidir onde ir primeiro.

 H13      UC13               Como agente, quero confirmar ou descartar um        Must             3     Sim
relato de foco, para que só relatos verdadeiros
contem no risco.

 H14      UC14               Como agente, quero registrar a visita               Must             3     Sim
(trabalhado, fechado, recusa e focos
eliminados), para medir o trabalho e as
pendências.

 H18      UC18               Como sentinela, preciso enviar leituras             Must             5     Sim
periódicas (ovos, nível de água, temperatura e
umidade), para alimentar o cálculo de risco.
Página 16
ID       Caso de uso        História de usuário                                   MoSCoW   SP   MVP

 H21      UC20               Como gestor, preciso que o sistema calcule o          Must     8    Sim
índice de risco por quarteirão com uma regra
explicável, para confiar na cor exibida.

 H22      UC21               Como gestor, quero um painel com o mapa de            Must     5    Sim
risco, as sentinelas e as ações da semana, para
decidir onde agir.

 H06      UC06               Como moradora, quero agendar a visita do              Should   5    Não
agente num horário em que estou em casa, para
meu imóvel não ficar pendente.

 H07      UC07               Como moradora, quero ver o retorno do meu             Should   3    Não
relato e quantos focos meu quarteirão eliminou,
para saber que minha ação contou.

 H08      UC01               Como idosa que não usa aplicativos, quero             Should   5    Não
receber o alerta por WhatsApp ou SMS, para não
depender de app.

 H15      UC12               Como agente, quero uma rota sugerida entre os         Should   8    Não
pontos prioritários, para gastar menos tempo de
deslocamento.

 H16      UC15               Como agente, quero ver minhas visitas                 Should   3    Não
agendadas por dia, para chegar quando o
morador está em casa.

 H17      UC16               Como agente, quero registrar a manutenção da          Should   2    Não
sentinela, para que ela nunca vire criadouro.

 H19      UC19               Como sentinela, preciso avisar falhas (bateria,       Should   2    Não
falta de água, sem leitura), para que a
manutenção seja acionada.

 H20      UC17               Como sistema, preciso importar dados públicos         Should   5    Não
semanais de clima e casos, para compor o
índice de risco.

 H23      UC22               Como gestor, quero configurar os limites que          Should   3    Não
mudam o nível de risco, para ajustar a
sensibilidade à realidade local.

 H24      UC23               Como gestor, quero cadastrar e acompanhar             Should   3    Não
sentinelas (local, status e anfitrião), para manter
a rede funcionando.

 H27      UC26               Como administrador, quero gerenciar usuários,         Should   3    Não
perfis e áreas, para controlar quem acessa o quê.
Página 17
ID        Caso de uso       História de usuário                               MoSCoW       SP      MVP

 H09       UC08              Como moradora, quero tirar dúvidas com um         Could        8       Não
assistente em linguagem simples, para saber
como cuidar de caixa d'água, calha e vasos.

 H10       UC09              Como morador, quero me oferecer como              Could        2       Não
anfitrião de uma sentinela, para ajudar a
vigilância do meu bairro.

 H11       UC10              Como moradora, quero ver a UBS mais próxima e     Could        2       Não
os sinais de alerta da dengue, para buscar
atendimento a tempo.

 H25       UC24              Como gestor, quero enviar um comunicado a um      Could        3       Não
bairro, para convocar um mutirão.

 H26       UC25              Como gestor, quero exportar um relatório de       Could        3       Não
impacto (focos, pendências e adesão), para
prestar contas.

 H28       —                 Como gestor, quero que a sentinela identifique    Won't        13      Não
mosquitos adultos por câmera e os capture, para
medir a população adulta.

 H29       —                 Como moradora, quero enviar uma foto do           Won't        13      Não
quintal para a IA apontar focos, para não
precisar do checklist.

 H30       —                 Como gestor, quero integração automática com      Won't        13      Não
o Sinan, para cruzar casos notificados com o
risco.

Totais: Must 47 SP (11 histórias) · Should 42 SP (11) · Could 18 SP (5) · Won't 39 SP (3). As histórias Won't
de 13 pontos são épicos: se entrarem no futuro, precisam ser quebradas.

Por que as Won't ficaram para depois: H28 é a evolução natural da sentinela, mas exige hardware
real, uma base de imagens rotuladas e testes de campo, o que não cabe no prazo nem no
simulador; H29 depende de IA de imagem pouco confiável em fotos caseiras e traz risco de
privacidade (fotos de casas e pessoas); H30 depende de acesso institucional ao sistema oficial de
notificação, impossível no prazo da GS.

4.3 Critérios de aceitação das histórias do MVP

H01 — Cadastrar endereço (2 SP)
● Dado que a moradora informa rua e número válidos, quando confirma, então o sistema
associa o endereço a um quarteirão e mostra o risco dele.
● O cadastro não pede CPF, RG nem foto.
Página 18
● Dado um endereço fora da área atendida, quando ela confirma, então o sistema avisa que o
bairro ainda não é monitorado.
● O formulário pode ser preenchido só com teclado e leitor de tela.

H02 — Ver risco do bairro (3 SP)
● Dado um quarteirão com índice calculado, quando a moradora abre o app, então vê o nível
(Baixo, Atenção, Alto ou Muito alto) em cor e texto.
● O nível mostra a data da última atualização e um motivo em linguagem simples (ex.: "muitos
ovos na sentinela da sua rua").
● Dado que não há dado recente (mais de 14 dias), então o app mostra "sem dados recentes"
em vez de uma cor.
● A tela carrega em até 3 segundos numa conexão móvel comum.

H03 — Receber alerta (5 SP)
● Dado que o risco do quarteirão sobe de nível, quando o cálculo semanal termina, então
todos os moradores cadastrados naquele quarteirão recebem um alerta.
● O alerta tem no máximo 300 caracteres e um link direto para a autovistoria.
● Dado que o morador já recebeu alerta naquela semana, então não recebe outro, exceto se o
nível chegar a Muito alto (RN02).
● O alerta traz o nome do serviço e o telefone oficial da prefeitura, para não parecer golpe.
● Toda notificação enviada fica registrada (data, quarteirão, nível), para o indicador de
adesão.

H04 — Autovistoria guiada (5 SP)
● Dado que a moradora abre a autovistoria, então vê um item por vez (no máximo 8), com
ícone e uma frase.
● Os primeiros itens são os tipos de criadouro mais frequentes no bairro, definidos pelo gestor.
● Para cada item ela marca "não tenho", "tinha água e eliminei" ou "tem foco e não consigo
eliminar".
● Dado que ela marca "não consigo eliminar", então o app oferece reportar o foco (H05) já
com o tipo preenchido.
● Ao concluir, o app mostra quantos itens ela eliminou e agradece.
● A autovistoria pode ser feita em até 10 minutos (validar com 3 pessoas no teste do protótipo).

H05 — Reportar foco (3 SP)
● Dado que a moradora informa local e tipo de foco, quando envia, então recebe um número
de protocolo.
● A foto é opcional; o app avisa para não fotografar pessoas.
● Dado que falta o local, quando ela envia, então o app pede o local antes de concluir.
● O relato entra como "aguardando triagem" e não altera o risco até ser confirmado (RN01).
Página 19
H12 — Quarteirões prioritários (5 SP)
● Dado que o agente abre a lista do dia, então vê os quarteirões da sua área ordenados do
maior para o menor risco.
● Cada item mostra o motivo (sentinela, relatos confirmados, pendências) e o número de
relatos aguardando triagem.
● Dado que o agente toca num quarteirão, então vê os imóveis com relato ou pendência.
● A lista funciona em tela de 360 px de largura.
● Dado que não há conexão, então o app mostra a última lista baixada com a data.

H13 — Triar relato (3 SP)
● Dado um relato aguardando triagem, quando o agente marca "confirmado", então o relato
passa a contar no risco do quarteirão.
● Quando marca "descartado", então informa o motivo numa lista curta (não encontrado, já
eliminado, endereço errado).
● O morador que relatou recebe o resultado.
● A foto do relato é apagada depois da triagem (RN06).

H14 — Registrar visita (3 SP)
● Dado um imóvel visitado, quando o agente registra, então escolhe a situação: trabalhado,
fechado, recusa ou parcial, como no boletim de campo.
● Dado "trabalhado", então informa quantos depósitos tinham foco e quantos foram
eliminados ou tratados.
● Dado "fechado", então o imóvel entra como pendência e o morador cadastrado recebe
convite para agendar (quando H06 existir).
● O registro leva no máximo 3 toques além dos números.

H18 — Leitura da sentinela (5 SP)
● Dado que a sentinela simulada está ativa, a cada ciclo ela envia código, data e hora,
contagem de ovos, nível de água, temperatura e umidade para a API.
● Dado um valor fora da faixa física (umidade acima de 100%, temperatura acima de 60 °C),
então a API rejeita a leitura e registra o erro.
● Dado que nível de água está abaixo do mínimo, então a leitura chega marcada como
"precisa de manutenção".
● Leituras de sentinela não cadastrada são recusadas.
● O circuito e o envio são demonstrados no simulador, com dados simulados declarados
como tal.

H21 — Índice de risco explicável (8 SP)
● O índice combina, por quarteirão e semana: Índice de Positividade de Ovitrampa, média de
ovos, relatos confirmados, pendências e, quando houver, clima e casos públicos.
Página 20
● Cada nível tem limites configuráveis, com valores iniciais documentados e a fonte de cada
um.
● Dado um quarteirão, então o sistema guarda quais fatores levaram ao nível (o "motivo"
mostrado em H02 e H12).
● Dado o mesmo conjunto de entradas, então o cálculo sempre produz o mesmo nível
(testável).
● Sentinelas sem leitura há mais de 48 horas ficam fora do cálculo (RN03).
● O modelo de regressão logística do notebook de Data Science é documentado como versão
2 do índice, com suas métricas e limitações.

H22 — Painel do gestor (5 SP)
● Dado que o gestor abre o painel, então vê o mapa de quarteirões por nível de risco, com
legenda em texto.
● O painel lista as sentinelas com status (ativa, sem leitura, precisa de manutenção).
● O painel mostra, na semana: alertas enviados, autovistorias concluídas, relatos confirmados,
focos eliminados e taxa de pendência.
● Dado que o gestor clica num quarteirão, então vê o motivo do nível e a evolução das últimas
8 semanas.
● As cores atendem a contraste mínimo de 4,5:1 e nunca são a única forma de informação.

4.4 Requisitos não funcionais
Código             Requisito

 RNF01              Textos em linguagem simples, com fonte mínima de 16 px no app do morador

 RNF02              Cor sempre acompanhada de texto; contraste mínimo de 4,5:1

 RNF03              Telas do morador e do agente utilizáveis em 360 px de largura

 RNF04              Telas principais carregam em até 3 segundos em conexão móvel

 RNF05              Dados pessoais mínimos (nome e endereço), com consentimento, conforme a LGPD;
indicadores sempre agregados por quarteirão e semana

 RNF06              O protótipo usa apenas dados simulados ou públicos, com a origem declarada

 RNF07              A API só aceita leituras de sentinelas autenticadas

4.5 Regras de negócio
Código             Regra

 RN01               Um relato de foco só altera o risco depois de confirmado por um agente

 RN02               No máximo um alerta por semana por quarteirão; a exceção é a mudança para Muito
alto
Página 21
Código             Regra

 RN03               Sentinela sem leitura há mais de 48 horas fica inativa e fora do cálculo

 RN04               O assistente não dá diagnóstico nem indica remédios; diante de sintomas, orienta
procurar a UBS

 RN05               Visitas só podem ser agendadas nas janelas definidas pela coordenação

 RN06               Fotos de relatos são apagadas após a triagem

 RN07               Só o gestor altera os limites de risco, e cada alteração fica registrada com data e autor

4.6 Plano de entregas (hipótese para apresentação)
Com uma velocidade hipotética de 25 SP por sprint de duas semanas, o MVP (47 SP) cabe em duas
sprints, a 94% da capacidade somada. A recomendação é comprometer cerca de 85% por sprint e
deixar o restante como meta extra.

 Entrega                                         Conteúdo                                                    SP

 Sprint 1 — "o sinal chega"                      H18, H21, H02, H01, H05                                     21

 Sprint 2 — "o sinal vira ação"                  H03, H04, H12, H13, H14, H22                                26

 Release 2 — "ninguém fica de fora"              Should: H06, H08, H16, H07, H17, H19, H20, H23, H24, H27,   42
H15

 Release 3                                       Could: H09, H10, H11, H25, H26                              18

A Sprint 2 passa um pouco de 25 SP: na rodada de Planning Poker, confirmem se H22 cabe ou se fica
como meta extra.

4.7 Protótipo das telas do MVP
O protótipo navegável cobre as 11 histórias do MVP (seção 4.2) e segue a identidade visual Sentinela:
petróleo para a marca, âmbar só para alertas, fundo areia e a fonte Poppins. O nível de risco
aparece sempre em cor, texto e medidor de 1 a 4 (RNF02), e os textos do app do morador têm no
mínimo 16 px (RNF01). Todos os dados são simulados (RNF06).
Página 22
Elemento visual no PDF: diagrama/telas do protótipo. A imagem original não foi convertida em texto.

Protótipo · Morador (app no celular): cadastro de endereço, risco do quarteirão e alerta
                     Protótipo · Morador: autovistoria guiada, reportar foco e relato enviado
Página 23
Elemento visual no PDF: diagrama/telas do protótipo. A imagem original não foi convertida em texto.

Protótipo · Agente de endemias: quarteirões prioritários e imóveis do quarteirão
                          Protótipo · Agente de endemias: triar relato e registrar visita
Página 24
Elemento visual no PDF: diagrama/telas do protótipo. A imagem original não foi convertida em texto.

Protótipo · Gestor da vigilância (painel no computador): indicadores, mapa de risco, detalhe do quarteirão e sentinelas
Página 25
5. Fontes
Todas as fontes externas foram consultadas em 10/11/2026.

Cenário epidemiológico e clima
● Dengue: casos prováveis caem 70% no Brasil em 2026 — Brasil 61
● El Niño pode aumentar casos de dengue e chikungunya, alerta Saúde — Metrópoles
● Segundo a NOAA, El Niño pode ser o mais intenso desde 1950 — INMET
● Dengue cai 70%, mas quase metade dos municípios tem alerta para mosquito — A Crítica
● Tecnologias adotadas pelo Ministério da Saúde para o controle da dengue — Agência Gov
● Campo Mourão (PR): imóveis fechados são o maior problema — Brasil 61
● Caraguatatuba (SP): imóveis fechados são a principal dificuldade — Brasil 61
● Lorena (SP): luta contra a dengue prejudicada por imóveis fechados — Brasil 61
● Instrução de preenchimento do Boletim de Vigilância e Controle — CVE-SP
