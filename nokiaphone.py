print('Nokia Phone Menu')

print('1: Phone book')
print('2: Messages')
print('3: Chat')
print('4: Call register')
print('5: Tones')
print('6: Settings')
print('7: Phone settings')
print('8: Games')
print('9: Calculator')
print('10: Reminders')
print('11: Clock')
print('12: Profiles')
print('13: SIM services')
Phone_menu = int(input('Enter option: '))

match(Phone_menu):
    case 1 :
        print('\n>Phone book')
        print('1: Search')
        print('2: Service Nos.')
        print('3: Add name')
        print('4: Erase')
        print('5: Edit')
        print('6: Assign tone')
        print('7: Send b card')
        print('8: Options')
        print('9: Speed dials')
        print('10: Voice tags')

        Phone_book = int(input('Enter option: '))
        
        

        match(Phone_book):
            case 1 : 
                print('\n>Search')
            case 2 : 
                print('\n>Services Nos.')
            case 3 :
                print('\n>Add name')
            case 4 :
                print('\n>Erase')
            case 5 :
                print('\n>Edit')
            case 6 :
                print('\n>Assign tone')
            case 7 :
                print('\n>Send bcard')
            case 8 :
                print('\n>option')
                print('1: Type of view')
                print('2: Memory status')
                option = int(input('Enter option: '))
                match(option):
                    case 1 :
                        print('\n>Type of view')
                    case 2 :
                        print('\n>Memory')
                    case _:
                        print('\n>Wrong parameter')


            case 9 :
                print('\n>Speed dials')
            case 10 :
                print('\n>Voice tags')
            case _:
                print('\n>Wrong parameter')         

    case 2 :
        print('Messages')
        print('1: Write messages')
        print('2: inbox')
        print('3: Outbox')
        print('4: Picture messages')
        print('5: Templates')
        print('6: Smileys')
        print('7: Message settings')
        print('8: Info service')
        print('9: Voice mailbox number')
        print('10: Service command editor')

        Messages = int(input('Enter option: '))


        match(Messages):
            case 1 : 
                print('\n>Write messages')
            case 2 : 
                print('\n>Inbox.')
            case 3 :
                print('\n>Outbox')
            case 4 :
                print('\n>Picture messages')
            case 5 :
                print('\n>Templates')
            case 6 :
                print('\n>Smileys')
            case 7 :
                print('\n>Message settings')
                print('1: Set')
                print('2: Common')
                Message_settings = int(input('Enter option: '))
                match(Message_settings):             
                    case 1 :
                        print('\n> Set')
                        print('1: Message center number')
                        print('2: Message sent as')
                        print('3: Message validity')
                        Set = int(input('Enter option: '))
                        match(Set):
                            case 1 :
                                print('\n>message center number')
                            case 2 :
                                print('\n>Message sent as')
                            case 3 :
                                print('\n>Message validity')
                            case _:
                                print('\n>Wrong parameter')
                    case 2 :
                        print('\n>common')
                        print('1: Delivery reports')
                        print('2: Reply via same centre')
                        print('3: Character support')
                        common = int(input('Enter option: '))
                        match(common):
                            case 1 :
                                print('\n>DFelivery reports')
                            case 2 :
                                print('\n>Reply via same centre')
                            case 3 :
                                print('\n>Character support')
                            case _:
                                print('\n>Wrong parameter')
            case 8 :
                print('\n>Info services')
            case 9 :
                print('\n>Voice mailbox number')
            case 10 :
                print('\n>Service command editor')
            case _:
                print('\n>Wrong parameter')  

        

    case 3 :
        print('\n>Chat')


    case 4 :
        print('\n>Call register')
        print('1: Missed calls')
        print('2: Recieved calls')
        print('3: Dialled numbers')
        print('4: Erase recent call lists')
        print('5: Show call duration')
        print('6: Show call cost')
        print('7: Call cost settings')
        print('8: Prepaid credit')
        call_register = int(input('Enter option: '))
        match(call_register):
            case 1 :
                print('\n>Missed calls')
            case 2 :
                print('\n>Recieved calls')
            case 3 :
                print('\n>Dialled numbers')
            case 4 :
                print('\n>Erase recent call lists')
            case 5 :
                print('\n>Show call duration')
                print('1: Last call duration')
                print('2: All calls duration')
                print('3: Received callls duration')
                print('4: Dialled calls duration')
                print('5: Clear timers')
                Show_call_duration = int(input('Enter option: '))
                match(Show_call_duration):
                    case 1 :
                        print('\n>Last call duration')
                    case 2 :
                        print('\n>All calls duration')
                    case 3 :
                        print('\n>Received calls duration')
                    case 4 :
                        print('\n>Dialled calls duration')
                    case 5 :
                        print('\n>Clear timers')
                    case _:
                        print('\n>Wrong parameter')

            case 6 :
                print('\n>Show call cost')
                print('1: Last call cost')
                print('2: All calls cost')
                print('3: Clear counters')
                Show_call_cost = int(input('Enter option: '))
                match(Show_call_cost):
                    case 1 :
                        print('\n>Last call cost')
                    case 2 :
                        print('\n>All calls cost')
                    case 3 :
                        print('\n>Clear counters')
                    case _:
                        print('\n>Wrong parameter')

            case 7 :
                print('\n>Call cost settings')
                print('1: Call cost limit')
                print('2: Show costs in')
                Call_cost_settings = int(input('Enter option: '))
                match(Call_cost_settings):
                    case 1 :
                        print('\n>Call cost limit')
                    case 2 :
                        print('\n>Show costs in')

            case 8 :
                print('\n>Prepaid credit')
            case _:
                print('\n>Wrong parameter')



    case 5 :
        print('\n>Tones')
        print('1: Ringing tone')
        print('2: Ringing volume')
        print('3: Incoming call alert')
        print('4: Composer')
        print('5: Message alert tone')
        print('6: Keypad tones')
        print('7: Warning and game tone')
        print('8: Vibrating alert')
        print('9: Screen saver')
        Tone = int(input('Enter option: '))
        match(Tone):
            case 1 :
                print('\n>Ringing tone')
            case 2 :
                print('\n>Ringing volume')
            case 3 :
                print('\n>Incoming call alert')
            case 4 :
                print('\n>Composer')
            case 5 :
                print('\n>Message alert tone')
            case 6 :
                print('\n>Keypad tones')
            case 7 :
                print('\n>Warning and game tones')
            case 8 :
                print('\n>Vibrating alert')
            case 9 :
                print('\n>Screen saver')
            case _:
                print('\n>Wrong parameter')

    case 6 :
        print('\n>Settings')
        print('1: Call settings')
        print('2: Phone settings')
        print('3: Security settings')
        print('4: Restore factory settings')
        Settings = int(input('Enter option: '))
        match(Settings):
            case 1 :
                print('\n>Call settings')
                print('1: Automatic redail')
                print('2: Speed dialling')
                print('3: Call waiting options')
                print('4: Own number sending')
                print('5: Phone line in use')
                print('6: Automatic answer')
                Call_settings = int(input('Enter nnumber: '))
                match(Call_settings):
                    case 1 :
                        print('\n>Automatic redail')
                    case 2 :
                        print('\n>Speed dialling')
                    case 3 :
                        print('\n>Call waiting options')
                    case 4 :
                        print('\n>Own number sending')
                    case 5 :
                        print('\n>Phone line in use')
                    case 6 :
                        print('\n>Automatic answer')
                    case _:
                        print('\n>Wrong prameter')

            case 2 :
                print('\n>Phone settings')
                print('1: Language')
                print('2: Cell info display')
                print('3: Welcome note')
                print('4: Network selection')
                print('5: Lights')
                print('6: Confirm SIM service actions')
                Phone_settings = int(input('Enter option: '))
                match(Phone_settings):
                    case 1 :
                        print('\n>Language')
                    case 2 :
                        print('\n>Cell info display')
                    case 3 :
                        print('\n>Welcome note')
                    case 4 :
                        print('\n>Network selection')
                    case 5 :
                        print('\n>Lights')
                    case 6 :
                        print('\n>Confirm SIM service actions')
                    case _:
                        print('\n>Wrong parameter')


            case 3 :
                print('\n>Security settings')
                print('1: PIN code request')
                print('2: Call baring service')
                print('3: Fixed dialling')
                print('4: Closed user group')
                print('5: Phone security')
                print('6: Change access codes')
                Security_settings = int(input('Enter option: '))
                match(Security_settings):
                    case 1 :
                        print('\n>PIN code request')
                    case 2 :
                        print('\n>Call baring service')
                    case 3 :
                        print('\n>Fixed dialling')
                    case 4 :
                        print('\n>Closed user group')
                    case 5 :
                        print('\n>Phone security')
                    case 6 :
                        print('\n>Change access codes')
                    case _:
                        print('\n>Wrong parameter')

            case 4 :
                print('\n>Restore factory settings')

    case 7 :
        print('\n>Phone settings')
    case 8 :
        print('\n>Games')
    case 9 :
        print('\n>Calculator')
    case 10:
        print('\n>Reminders')
    case 11:
        print('\n>Clock')
        print('1: Alarm clock')
        print('2: Clock settings')
        print('3: Date setting')
        print('4: Stopwatch')
        print('5: Countdown timer')
        print('6: Auto update of date and time')
        Clock = int(input('Enter option: '))
        match(Clock):
            case 1 :
                print('\n>Alarm clock')
            case 2 :
                print('\n>Clock settings')
            case 3 :
                print('\n>Date setting')
            case 4 :
                print('\n>Stopwatch')
            case 5 :
                print('\n>Countdown timer')
            case 6 :
                print('\n>Auto update of date and time')
            case _:
                print('\n>Wromg parameter')

    case 12:
        print('\n>Profiles')
    case 13:
        print('\n>SIM services')
    case _:
        print('\n>Wrong parameter')

