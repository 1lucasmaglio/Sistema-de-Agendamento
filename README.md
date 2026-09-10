# Sistema-de-Agendamento
![GitHub repo size](https://img.shields.io/github/repo-size/1lucasmaglio/Sistema-de-Agendamento?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/1lucasmaglio/Sistema-de-Agendamento?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/1lucasmaglio/Sistema-de-Agendamento?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/Sistema-de-Agendamento/painel-de-atendimento?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/1lucasmaglio/Sistema-de-Agendamento?style=for-the-badge)

<img src="https://www.magnific.com/br/fotos-gratis/belo-retrato-de-cachorro-pequeno-com-bolhas_21249117.htm#fromView=keyword&page=1&position=2&uuid=fbe1c365-9107-42c6-95bd-cc1d1854aff1&query=Banho+tosa" alt="PlaceHolderdoBanhoeTosa">

# Sistema de Agendamento para Banho e tosa
  Um projeto focado em desenvolver competências e adquirir experiência de forma prática, o aplicativo é dividido em duas partes:
  ## Desktop:
  Onde será possível verificar os horários disponíveis, administrando se será possível ou não receber clientes. 
  ## Web:
  Verificar por um sistema de usuário quando haverá hotários disponíveis, além de marcar um horário para o seu pet.
  Também será possível verificar o valor de cada serviço oferecido pelo estabelecimento.

# 🔄Fluxograma do projeto:
### Cliente

```
┌─────────────────────────────────────────────────────────────┐
│                   USUÁRIO (PET OWNER)                       │
└──────────────────┬──────────────────────────────────────────┘
                   │
        ┌──────────┴──────────┐
        │                     │
        ▼                     ▼
   [ACESSO]              [NOVO USUÁRIO]
        │                     │
        ├──Login──────────Register─┐
        │                     │   │
        └─────────┬───────────┘   │
                  │               │
                  ▼               │
         ┌─────────────────┐      │
         │ DASHBOARD       │◄─────┘
         │ (HOME)          │
         └────────┬────────┘
                  │
        ┌─────────┼─────────┐
        │         │         │
        ▼         ▼         ▼
    [SERVIÇOS] [PETS]   [AGENDAMENTOS]
        │         │         │
        └─────────┼─────────┘
                  │
                  ▼
        ┌──────────────────┐
        │ BOOKING FORM     │
        ├──────────────────┤
        │ • Selecionar Pet │
        │ • Serviço        │
        │ • Data/Hora      │
        │ • Confirmação    │
        └────────┬─────────┘
                 │
                 ▼
        ┌─────────────────────┐
        │ CONFIRMAÇÃO DO AGEND.│
        └────────┬────────────┘
                 │
        ┌────────┴────────┐
        │                 │
        ▼                 ▼
    [NOTIFICAÇÃO]   [FEEDBACK]
    Email/SMS        Reviews
        │                 │
        └────────┬────────┘
                 │
         ┌───────▼────────┐
         │ HISTÓRICO DE   │
         │ AGENDAMENTOS   │
         │ (Editar/Canc.) │
         └────────────────┘
```         
### Adiministrador:

```
┌─────────────────────────────────────────────────────────────┐
│               ADMINISTRADOR/STAFF                           │
└──────────────────┬──────────────────────────────────────────┘
                   │
                   ▼
            [LOGIN ADMIN]
                   │
                   ▼
         ┌──────────────────────┐
         │ PAINEL ADMINISTRATIVO│
         ├──────────────────────┤
         │ • Dashboard          │
         │ • Gerenciar Clientes │
         │ • Gerenciar Pets     │
         │ • Gerenciar Serviços │
         │ • Calendarário       │
         │ • Relatórios         │
         │ • Configurações      │
         └──────────────────────┘
                   │
        ┌──────────┼──────────┬──────────┐
        │          │          │          │
        ▼          ▼          ▼          ▼
    [APROVA]  [EDITA]   [CANCELA]  [NOTIFICA]
     AGENDS.   SERVIÇOS  AGENDAMS.  CLIENTES
```

# 🗺️ Roadmap do Projeto:

## MVP(Produto Mínimo Viável) - Semanas 1 - 4
Status: 🟠 50% Concluído
- [x] Setup inicial
- [x] CRUD menu
- [ ] Frontend Desktop (Em progresso)
- [ ] Sistema de Login (Prioridade Alta)
- [ ] Sistema de gerenciamento de banco de dados (Prioridade Alta) 

## Funções Essenciais - Semanas 4 - 6
Status: 🔴 0% Iniciado
- [ ] Autenticação
- [ ] Perfil de usuário (web)
- [ ] Perfil de Adiministrador (web)
- [ ] Gerenciamento de agenda
- [ ] Histórico de agendamentos anteriores
- [ ] Notificação para o cliente
- [ ] Cancelamento e edição
Objetivo: Plataforma funcional.

## Dashboard Adiministrativo - Semanas 7 - 10
Status: 🔴 0% Iniciado
- [ ] Tabelas e powerBI com estatísticas
- [ ] Gerenciamento de Clientes
- [ ] Ajuste de serviços (mudar preço etc.)
- [ ] Gestão de agendamentos em fortmato de calendário
- [ ] Relatórios de final de mês
- [ ] UI Simples, Bonita e Funcional
Objetivo: Lapidar funcionalidades, corrigir bugs e "Embelezar" o aplicativo.

### Otimização e Finalização - Semanas 10 - 14
Status: 🔴 0% Iniciado
- [ ] Utilizar o feedback sobre a UI
- [ ] Sistema de pagamento via pix
- [ ] Integração com calendários (Proton calendar, google calendar etc)
- [ ] Testes automatizados
- [ ] Deploy
Objetivo: Produto pronto para ser usado. 

## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/1lucasmaglio" title="Sobre">
        <img src="https://avatars.githubusercontent.com/u/266368513?v=4" width="100px;"   alt="Foto do Lucas Maglio no GitHub"/><br>
        <sub>
          <b>Lucas Maglio</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/YannEscobar" title="Sobre">
        <img src="https://avatars.githubusercontent.com/u/240530528?v=4" width="100px;" alt="Foto do Yann no GitHub"/><br>
        <sub>
          <b>Yann Escobar</b>
        </sub>
      </a>
      <td align="center">
      <a href="https://github.com/ThiagoALM626" title="Sobre">
        <img src="https://avatars.githubusercontent.com/u/288315951?v=4" width="100px;" alt="Foto do ThiagoALM626 no GitHub"/><br>
        <sub>
          <b>ThiagoALM626</b>
        </sub>
      </a>
      <td align="center">
      <a href="https://github.com/thiagobasilio887-sys" title="Sobre">
        <img src="https://avatars.githubusercontent.com/u/288312813?v=4" width="100px;" alt="Foto do thiagobasilio887-sys no GitHub"/><br>
        <sub>
          <b>ThiagoALM626</b>
        </sub>
      </a>
  </tr>
</table>
