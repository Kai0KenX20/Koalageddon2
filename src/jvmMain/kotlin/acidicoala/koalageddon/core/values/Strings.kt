package acidicoala.koalageddon.core.values

sealed class Strings(
    val appId: String = "App ID",
    val appStatusOriginal: String,
    val appStatusUnlocked: String,
    val appStatusLocked: String,
    val autoInjectInventory: String,
    val buildTimestamp: String,
    val cacheSize: String,
    val cancel: String,
    val checkForUpdates: String,
    val clearCache: String,
    val computing: String,
    val configuration: String,
    val confirmForceModifyInstallationMessage: String,
    val confirmForceModifyInstallationTitle: String,
    val defaultAppStatus: String,
    val dlcId: String = "DLC ID",
    val downloadingRelease: String,
    val downloadPreReleaseVersions: String,
    val error: String,
    val extraInventoryItems: String,
    val fetchingToolInfo: String,
    val gameMode: String,
    val inDevelopment: String,
    val information: String,
    val install: String,
    val installation: String,
    val installationError: String,
    val installationStatus: String,
    val installationSuccess: String,
    val installed: String,
    val itemId: String = "Item ID",
    val language: String,
    val languageDe: String = "Deutsch",
    val languageEn: String = "English",
    val languageFr: String = "Français",
    val languageIt: String = "Italiano",
    val languagePtBr: String = "Português (Brasil)",
    val languageRu: String = "Русский",
    val languageTr: String = "Türkçe",
    val languageZhCn: String = "简体中文",
    val logging: String,
    val modifyInstallation: String,
    val ok: String = "OK",
    val openDataDirectory: String,
    val openLatestReleasePage: String,
    val openLogFile: String,
    val openOfficialForumTopic: String,
    val overrideAppStatus: String,
    val overrideDlcStatus: String,
    val notInstalled: String,
    val processStatusRunning: String,
    val processStatusNotRunning: String,
    val refreshStatus: String,
    val reloadConfig: String,
    val reloadConfigTooltip: String,
    val reloadConfigSuccess: String,
    val reloadConfigError: String,
    val restoreDefaultConfiguration: String,
    val settings: String,
    val startPage: String,
    val startPageWelcome: String,
    val storeMode: String,
    val storeProcessStatus: String,
    val storeEpic: String = "Epic Game Store",
    val storeSteam: String = "Steam",
    val storeUbisoft: String = "Ubisoft Connect",
    val theme: String,
    val themeDark: String,
    val themeLight: String,
    val toolConfig: String,
    val toolDll: String = "%0 DLL",
    val removalError: String,
    val removalSuccess: String,
    val remove: String,
    val unlocker: String,
    val unlockFamilySharing: String,
    val version: String,
) {
    object German : Strings(
        autoInjectInventory = "Gegenstände automatisch zum Steam Inventar unterstützter Spiele hinzufügen",
        appStatusOriginal = "Original",
        appStatusUnlocked = "Freigeschaltet",
        appStatusLocked = "Gesperrt",
        buildTimestamp = "Zeitstempel der Build",
        cacheSize = "Größe des Caches: %0",
        cancel = "Abbrechen",
        checkForUpdates = "Nach Updates suchen",
        clearCache = "Cache löschen",
        computing = "Berechne",
        configuration = "Konfiguration",
        confirmForceModifyInstallationMessage = "Auf Ihrem System wird derzeit Prozess %0 ausgeführt. " +
                "Um den Status der Installation ändern zu können, muss dieser Prozess zunächst beendet werden. " +
                "Möchten Sie den Prozess jetzt schließen und mit der Installation fortfahren?",
        confirmForceModifyInstallationTitle = "Proceed with installation / removal?",
        defaultAppStatus = "Standard Spielstatus",
        downloadingRelease = "Lade %0 Veröffentlichung herunter: %1 von %2",
        downloadPreReleaseVersions = "Vorveröffentlichungen der Tools herunterladen",
        error = "❌ Fehler",
        extraInventoryItems = "Zusätzliche Gegenstände zum Steam Inventar unterstützter Spiele hinzufügen",
        fetchingToolInfo = "Rufe %0 Daten ab",
        gameMode = "Spielmodus",
        inDevelopment = "In Arbeit",
        information = "Information",
        install = "Installieren",
        installation = "Installation",
        installationError = "❌ Fehler bei der Installation",
        installationStatus = "Status der Installation",
        installationSuccess = "✅ Die Installation war erfolgreich",
        installed = "%0 installiert",
        language = "Sprache",
        logging = "Logdatei erstellen",
        modifyInstallation = "Installation modifizieren",
        openDataDirectory = "Datenordner öffnen",
        openLatestReleasePage = "Seite der neuesten Veröffentlichung öffnen",
        openLogFile = "Protokolldatei öffnen",
        openOfficialForumTopic = "Seite des offiziellen Forum-Themas öffnen",
        overrideAppStatus = "Spielstatus überschreiben",
        overrideDlcStatus = "DLC Status überschreiben",
        notInstalled = "Nicht installiert",
        processStatusRunning = "Wird ausgeführt",
        processStatusNotRunning = "Wird nicht ausgeführt",
        refreshStatus = "Status aktualisieren",
        reloadConfig = "Konfiguration neu laden",
        reloadConfigTooltip = "Lädt die Konfiguration bei laufendem Steam Prozess neu",
        reloadConfigSuccess = "✅ Die Konfiguration wurde erfolgreich neu geladen",
        reloadConfigError = "❌ Fehler beim Neuladen der Konfiguration",
        restoreDefaultConfiguration = "Originale Konfiguration wiederherstellen",
        settings = "Einstellungen",
        startPage = "Startseite",
        startPageWelcome = "Willkommen zu Koalageddon v%0",
        storeMode = "Spieleplattform Modus",
        storeProcessStatus = "%0 Prozess Status",
        theme = "Aussehen",
        themeDark = "Dunkel",
        themeLight = "Hell",
        toolConfig = "%0 Konfiguration",
        removalError = "❌ Fehler beim Entfernen",
        removalSuccess = "✅ Das Entfernen war erfolgreich.",
        remove = "Entfernen",
        unlocker = "Unlocker",
        unlockFamilySharing = "Steam Family Sharing freischalten",
        version = "Version v%0",
    )

    object English : Strings(
        autoInjectInventory = "Automatically inject items into an in-game Steam inventory",
        appStatusOriginal = "Original",
        appStatusUnlocked = "Unlocked",
        appStatusLocked = "Locked",
        buildTimestamp = "Build timestamp",
        cacheSize = "Cache size: %0",
        cancel = "Cancel",
        checkForUpdates = "Check for updates",
        clearCache = "Clear cache",
        computing = "Computing",
        configuration = "Configuration",
        confirmForceModifyInstallationMessage = "Process %0 has been found currently running on your system. " +
                "To modify installation status, it is necessary to close this process. " +
                "Do you wish to proceed with installation by forcibly closing it?",
        confirmForceModifyInstallationTitle = "Proceed with installation / removal?",
        defaultAppStatus = "Default game status",
        downloadingRelease = "Downloading %0 release: %1 out of %2",
        downloadPreReleaseVersions = "Download pre-release versions of tools",
        error = "❌ Error",
        extraInventoryItems = "Inject extra items into an in-game Steam inventory",
        fetchingToolInfo = "Fetching %0 info",
        gameMode = "Game mode",
        inDevelopment = "In development",
        information = "Information",
        install = "Install",
        installation = "Installation",
        installationError = "❌ Installation error",
        installationStatus = "Installation status",
        installationSuccess = "✅ Installation was successful",
        installed = "Installed %0",
        language = "Language",
        logging = "Logging",
        modifyInstallation = "Modify installation",
        openDataDirectory = "Open data directory",
        openLatestReleasePage = "Open latest release page",
        openLogFile = "Open log file",
        openOfficialForumTopic = "Open official forum topic",
        overrideAppStatus = "Override game status",
        overrideDlcStatus = "Override DLC status",
        notInstalled = "Not installed",
        processStatusRunning = "Running",
        processStatusNotRunning = "Not running",
        refreshStatus = "Refresh status",
        reloadConfig = "Reload configuration",
        reloadConfigTooltip = "Reloads configuration in a running Steam process",
        reloadConfigSuccess = "✅ Configuration was successfully reloaded",
        reloadConfigError = "❌ Error reloading configuration",
        restoreDefaultConfiguration = "Restore default configuration",
        settings = "Settings",
        startPage = "Start page",
        startPageWelcome = "Welcome to Koalageddon v%0",
        storeMode = "Store mode",
        storeProcessStatus = "%0 process status",
        theme = "Theme",
        themeDark = "Dark",
        themeLight = "Light",
        toolConfig = "%0 config",
        removalError = "❌ Removal error",
        removalSuccess = "✅ Removal success",
        remove = "Remove",
        unlocker = "Unlocker",
        unlockFamilySharing = "Unlock Family Sharing",
        version = "Version v%0",
    )

    object French : Strings(
        autoInjectInventory = "Injection automatique des objets dans l'inventaire Steam d'un jeu",
        appStatusOriginal = "Original",
        appStatusUnlocked = "Débloqué",
        appStatusLocked = "Bloqué",
        buildTimestamp = "Date du build",
        cacheSize = "Taille du cache : %0",
        cancel = "Annuler",
        checkForUpdates = "Vérifier les mises à jour",
        clearCache = "Nettoyer le cache",
        computing = "Calcul",
        configuration = "Configuration",
        confirmForceModifyInstallationMessage = "Le processus %0 est en cours d'exécutuon sur votre système. " +
                "Pour modifier l'état d'installation, il est nécessaire de mettre fin à la tâche. " +
                "Voulez-vous forcer l'arrêt du processus pour mettre à jour l'état d'installation ?",
        confirmForceModifyInstallationTitle = "Continuer l'installation / supprimer ?",
        defaultAppStatus = "État des jeux par défaut",
        downloadingRelease = "Téléchargement de la mise à jour %0 : %1 sur %2",
        downloadPreReleaseVersions = "Télécharger les préversions du logiciel",
        error = "❌ Erreur",
        extraInventoryItems = "Injection spécifique d'objets dans l'inventaire Steam d'un jeu",
        fetchingToolInfo = "Récupération des informations de %0",
        gameMode = "Mode jeu",
        inDevelopment = "En développement",
        information = "Information",
        install = "Installer",
        installation = "Installation",
        installationError = "❌ Erreur d'installation",
        installationStatus = "État d'installation",
        installationSuccess = "✅ Installation réussie",
        installed = "Installé : %0",
        language = "Langue",
        logging = "Journalisation",
        modifyInstallation = "Modifier l'installation",
        openDataDirectory = "Ouvrir le répertoire de données",
        openLatestReleasePage = "Accéder à la dernière version",
        openLogFile = "Ouvrir le fichier de journalisation",
        openOfficialForumTopic = "Accès au forum officiel",
        overrideAppStatus = "État de jeu spécifique",
        overrideDlcStatus = "État de DLC spécifique",
        notInstalled = "Non-installé",
        processStatusRunning = "En cours d'exécution",
        processStatusNotRunning = "Éteint",
        refreshStatus = "Rafraîchir l'état",
        reloadConfig = "Recharger la configuration",
        reloadConfigTooltip = "Recharge la configuration sur un processus Steam en cours d'exécution",
        reloadConfigSuccess = "✅ Chargement de la configuration réussie",
        reloadConfigError = "❌ Erreur de chargement de la configuration",
        restoreDefaultConfiguration = "Restaurer la config. par défaut",
        settings = "Paramètres",
        startPage = "Accueil",
        startPageWelcome = "Bienvenue sur Koalageddon v%0",
        storeMode = "Mode boutique",
        storeProcessStatus = "État du processus %0",
        theme = "Apparence",
        themeDark = "Sombre",
        themeLight = "Clair",
        toolConfig = "Config. de %0",
        removalError = "❌ Erreur de suppression",
        removalSuccess = "✅ Suppression réussie",
        remove = "Supprimer",
        unlocker = "Débloqueur",
        unlockFamilySharing = "Débloquer le partage familial",
        version = "Version v%0",
    )

    object Italian : Strings(
        autoInjectInventory = "Inserisci automaticamente oggetti in un inventario di Steam in-game",
        appStatusOriginal = "Originale",
        appStatusUnlocked = "Sbloccato",
        appStatusLocked = "Bloccato",
        buildTimestamp = "Data/Ora della Build",
        cacheSize = "Dimensione della cache: %0",
        cancel = "Annulla",
        checkForUpdates = "Verifica aggiornamenti",
        clearCache = "Svuota cache",
        computing = "Calcolare",
        configuration = "Configurazione",
        confirmForceModifyInstallationMessage = "Il processo %0 è attualmente in esecuzione sul tuo sistema. " +
                "Per modificare lo stato dell'installazione è necessario chiudere questo processo. " +
                "Vuoi procedere con l'installazione chiudendolo forzatamente?",
        confirmForceModifyInstallationTitle = "Procedere con l'installazione / rimozione?",
        defaultAppStatus = "Stato di gioco predefinito",
        downloadingRelease = "Scaricando %0: %1 su %2",
        downloadPreReleaseVersions = "Scarica la versione pre-release degli strumenti",
        error = "❌ Errore",
        extraInventoryItems = "Inserisci oggetti extra in un inventario Steam in-game",
        fetchingToolInfo = "Acquisizione dati %0",
        gameMode = "Modalità gioco",
        inDevelopment = "In sviluppo",
        information = "Informazioni",
        install = "Installa",
        installation = "Installazione",
        installationError = "❌ Errore di installazione",
        installationStatus = "Status di installazione",
        installationSuccess = "✅ Installazione riuscita",
        installed = "%0 installato",
        language = "Lingua",
        logging = "Registrazione dei dati",
        modifyInstallation = "Modifica installazione",
        openDataDirectory = "Apri cartella dati",
        openLatestReleasePage = "Apri la pagina dell'ultima versione",
        openLogFile = "Apri il file di registro",
        openOfficialForumTopic = "Apri la pagina dell'argomento sul forum ufficiale",
        overrideAppStatus = "Sovrascrivi lo stato del gioco",
        overrideDlcStatus = "Sovrascrivi lo stato dei DLC",
        notInstalled = "Non installato",
        processStatusRunning = "In esecuzione",
        processStatusNotRunning = "Non in esecuzione",
        refreshStatus = "Aggiorna status",
        reloadConfig = "Ricarica configurazione",
        reloadConfigTooltip = "Ricarica la configurazione di un processo Steam in esecuzione",
        reloadConfigSuccess = "✅ Configurazione ricaricata con successo",
        reloadConfigError = "❌ Errore nel ricaricamento della configurazione",
        restoreDefaultConfiguration = "Ripristina la configurazione predefinita",
        settings = "Impostazioni",
        startPage = "Pagina iniziale",
        startPageWelcome = "Benvenuto a Koalageddon v%0",
        storeMode = "Modalità negozio",
        storeProcessStatus = "Stato del processo %0",
        theme = "Tema",
        themeDark = "Scuro",
        themeLight = "Chiaro",
        toolConfig = "%0 config",
        removalError = "❌ Errore nella rimozione",
        removalSuccess = "✅ Rimosso con successo",
        remove = "Rimuovi",
        unlocker = "Unlocker",
        unlockFamilySharing = "Sblocca Condivisione familiare della Libreria Steam (Family Sharing)",
        version = "Versione v%0",
    )

    object BrazilianPortuguese : Strings(
        autoInjectInventory = "Injetar automaticamente itens no inventário steam dentro do jogo",
        appStatusOriginal = "Original",
        appStatusUnlocked = "Desbloqueado",
        appStatusLocked = "Bloqueado",
        buildTimestamp = "Data/Hora da Build",
        cacheSize = "Tamanho do cache: %0",
        cancel = "Cancelar",
        checkForUpdates = "Verificar se há atualizações",
        clearCache = "Limpar cache",
        computing = "Computando",
        configuration = "Configurações",
        confirmForceModifyInstallationMessage = "Processo %0 foi encontrado execução no seu sistema. " +
                "Para modificar o status da instalação, é necessário encerrar este processo. " +
                "Você deseja continuar com a instalação encerrando o processo?",
        confirmForceModifyInstallationTitle = "Continuar com a instalação / desinstalação?",
        defaultAppStatus = "Status padrão do jogo",
        downloadingRelease = "Baixando a versão %0: %1 de %2",
        downloadPreReleaseVersions = "Download de versões pré-lançamento das ferramentas",
        error = "❌ Erro",
        extraInventoryItems = "Injetar itens extras no inventário steam dentro do jogo",
        fetchingToolInfo = "Recebendo informações %0",
        gameMode = "Modo de jogo",
        inDevelopment = "Em desenvolvimento",
        information = "Informação",
        install = "Instalar",
        installation = "Instalação",
        installationError = "❌ Erro de instalação",
        installationStatus = "Status de instalação",
        installationSuccess = "✅ A instalação foi concluida",
        installed = "Instalado %0",
        language = "Linguagem",
        logging = "Manter Log",
        modifyInstallation = "Modificar instalação",
        openDataDirectory = "Abrir diretório dos dados",
        openLatestReleasePage = "Abrir a página da versão mais recente",
        openLogFile = "Abrir arquivo de registro",
        openOfficialForumTopic = "Abrir tópico do fórum oficial",
        overrideAppStatus = "Substituir status do jogo",
        overrideDlcStatus = "Substituir status da DLC",
        notInstalled = "Não instalado",
        processStatusRunning = "Em execução",
        processStatusNotRunning = "Não está em execução",
        refreshStatus = "Atualizar status",
        reloadConfig = "Recarregar configuração",
        reloadConfigTooltip = "Recarregar a configuração em um processo Steam em execução",
        reloadConfigSuccess = "✅ A configuração foi recarregada com sucesso",
        reloadConfigError = "❌ Erro ao recarregar a configuração",
        restoreDefaultConfiguration = "Restaurar configuração padrão",
        settings = "Configurações",
        startPage = "Página inicial",
        startPageWelcome = "Bem-vindo ao Koalageddon v%0",
        storeMode = "Modo loja",
        storeProcessStatus = "Status do processo %0",
        theme = "Tema",
        themeDark = "Escuro",
        themeLight = "Claro",
        toolConfig = "Configuração do(a) %0",
        removalError = "❌ Erro na Remoção",
        removalSuccess = "✅ Removido com sucesso",
        remove = "Remover",
        unlocker = "Desbloquear",
        unlockFamilySharing = "Desbloquear o Compartilhamento de Biblioteca (Family Sharing)",
        version = "Versão v%0",
    )

    object Russian : Strings(
        autoInjectInventory = "Автоматически внедрять предметы во внутриигровой Steam инвентарь",
        appStatusOriginal = "Оригинальный",
        appStatusUnlocked = "Разблокированный",
        appStatusLocked = "Заблокированный",
        buildTimestamp = "Дата и время сборки",
        cacheSize = "Размер кэша: %0",
        cancel = "Отменить",
        checkForUpdates = "Проверить обновления",
        clearCache = "Очистить кэш",
        computing = "Вычисляется",
        configuration = "Конфигурация",
        confirmForceModifyInstallationMessage = "Процесс %0 был найден в настоящее время работающим на вашей системе. " +
                "Чтобы изменить статус установки, необходимо закрыть этот процесс. " +
                "Вы хотите продолжить установку, принудительно закрыв его?",
        confirmForceModifyInstallationTitle = "Продолжить установку / удаление?",
        defaultAppStatus = "Статус игр по умолчанию",
        downloadingRelease = "Загрузка %0 релиза: %1 из %2",
        downloadPreReleaseVersions = "Загружать предварительные версии инструментов",
        error = "❌ Ошибка",
        extraInventoryItems = "Внедрить дополнительные предметы во внутриигровой Steam инвентарь",
        fetchingToolInfo = "Получение данных %0",
        gameMode = "Режим игры",
        inDevelopment = "В разработке",
        information = "Информация",
        install = "Установить",
        installation = "Установка",
        installationError = "❌ Ошибка установки",
        installationStatus = "Статус установки",
        installationSuccess = "✅ Установка прошла успешно",
        installed = "Установлено %0",
        language = "Язык",
        logging = "Ведение журнала",
        modifyInstallation = "Изменить установку",
        openDataDirectory = "Открыть директорию данных",
        openLatestReleasePage = "Открыть страницу последнего релиза",
        openLogFile = "Открыть файл журнала",
        openOfficialForumTopic = "Открыть официальный топик форума",
        overrideAppStatus = "Заменить статус игры",
        overrideDlcStatus = "Заменить статус DLC",
        notInstalled = "Не установлено",
        processStatusRunning = "Запущен",
        processStatusNotRunning = "Не запущен",
        refreshStatus = "Обновить статус",
        reloadConfig = "Перезагрузить конфигурацию",
        reloadConfigTooltip = "Перезагружает конфигурацию в запущенном процессе Steam",
        reloadConfigSuccess = "✅ Конфигурация успешно перезагружена",
        reloadConfigError = "❌ Ошибка перезагрузки конфигурации",
        settings = "Настройки",
        restoreDefaultConfiguration = "Восстановить конфигурацию по умолчанию",
        startPage = "Стартовая страница",
        startPageWelcome = "Добро пожаловать в Koalageddon v%0",
        storeMode = "Режим магазина",
        storeProcessStatus = "Статус процесса %0",
        theme = "Тема",
        themeDark = "Тёмная",
        themeLight = "Светлая",
        toolConfig = "Конфигурация %0",
        removalError = "❌ Ошибка удаления",
        removalSuccess = "✅ Удаление прошло успешно",
        remove = "Удалить",
        unlocker = "Разблокировщик",
        unlockFamilySharing = "Разблокировать Семейный Доступ (Family Sharing)",
        version = "Версия v%0",
    )

    object Turkish : Strings(
        autoInjectInventory = "Eşyaları otomatik olarak oyun içi bir Steam envanterine ekle",
        appStatusOriginal = "Orijinal",
        appStatusUnlocked = "Açık",
        appStatusLocked = "Kilitli",
        buildTimestamp = "Zaman damgası oluştur",
        cacheSize = "Önbellek boyutu: %0",
        cancel = "İptal",
        checkForUpdates = "Güncelleştirmeleri kontrol et",
        clearCache = "Önbelleği temizle",
        computing = "İşleniyor",
        configuration = "Yapılandırma",
        confirmForceModifyInstallationMessage = "%0 işlemi şu anda sisteminizde çalışıyor. " +
                "Yükleme durumunu değiştirmek için bu işlemi kapatmak gerekir. " +
                "İşlemi zorla kapatarak yüklemeye devam etmek istiyor musunuz?",
        confirmForceModifyInstallationTitle = "Kurulum / kaldırma işlemine devam edilsin mi?",
        defaultAppStatus = "Varsayılan oyun durumu",
        downloadingRelease = "%0 sürümü indiriliyor: %1 / %2",
        downloadPreReleaseVersions = "Araçların yayınlanma öncesi sürümlerini indirin",
        error = "❌ Hata",
        extraInventoryItems = "Oyun içi bir Steam envanterine ekstra eşyalar ekleyin",
        fetchingToolInfo = "%0 bilgisi getiriliyor",
        gameMode = "Oyun Modu",
        inDevelopment = "Geliştirilme aşamasında",
        information = "Bilgi",
        install = "Yükle",
        installation = "Yükleme",
        installationError = "❌ Yükleme hatası",
        installationStatus = "Yükleme durumu",
        installationSuccess = "✅ Yükleme başarıyla gerçekleşti",
        installed = "%0 Yüklendi",
        language = "Dil",
        logging = "Log kaydı alınıyor",
        modifyInstallation = "Kurulumu düzenle",
        openDataDirectory = "Veri dizinini aç",
        openLatestReleasePage = "En son sürümün sayfasını aç",
        openLogFile = "Log dosyasını aç",
        openOfficialForumTopic = "Resmi forum konusunu aç",
        overrideAppStatus = "Oyun durumunu geçersiz kıl",
        overrideDlcStatus = "DLC durumunu geçersiz kıl",
        notInstalled = "Yüklü değil",
        processStatusRunning = "Çalışıyor",
        processStatusNotRunning = "Çalışmıyor",
        refreshStatus = "Durumu yenile",
        reloadConfig = "Yapılandırmayı yeniden yükle",
        reloadConfigTooltip = "Çalışan bir Steam işleminde yapılandırmayı yeniden yükler",
        reloadConfigSuccess = "✅ Yapılandırma başarıyla yeniden yüklendi",
        reloadConfigError = "❌ Yapılandırma yeniden yüklenirken hata oluştu",
        restoreDefaultConfiguration = "Varsayılan yapılandırmayı geri yükle",
        settings = "Ayarlar",
        startPage = "Başlangıç sayfası",
        startPageWelcome = "Koalageddon v%0'a hoş geldiniz!",
        storeMode = "Mağaza modu",
        storeProcessStatus = "%0 işlem durumu",
        theme = "Tema",
        themeDark = "Karanlık",
        themeLight = "Aydınlık",
        toolConfig = "%0 yapılandırma",
        removalError = "❌ Kaldırma hatası",
        removalSuccess = "✅ Kaldırma başarılı",
        remove = "Kaldır",
        unlocker = "Kilit açıcı",
        unlockFamilySharing = "Aile Paylaşımının Kilidini Aç",
        version = "Sürüm v%0",
    )

    object SimplifiedChinese : Strings(
        autoInjectInventory = "自动将物品注入游戏内 Steam 库存",
        appStatusOriginal = "原生",
        appStatusUnlocked = "已解锁",
        appStatusLocked = "未解锁",
        buildTimestamp = "构建时间戳",
        cacheSize = "缓存大小: %0",
        cancel = "取消",
        checkForUpdates = "检查更新",
        clearCache = "清理缓存",
        computing = "计算中",
        configuration = "配置",
        confirmForceModifyInstallationMessage = "检测到进程 %0 正在运行。 " +
                "要更改安装状态，必须关闭该进程。 " +
                "是否要强制关闭该进程以继续安装？",
        confirmForceModifyInstallationTitle = "继续安装/移除？",
        defaultAppStatus = "默认游戏状态",
        downloadingRelease = "正在下载 %0: %1 共 %2",
        downloadPreReleaseVersions = "下载预览版工具",
        error = "❌ 错误",
        extraInventoryItems = "将额外的物品注入游戏内的 Steam 库存",
        fetchingToolInfo = "正在获取 %0 信息",
        gameMode = "游戏模式",
        inDevelopment = "开发中",
        information = "信息",
        install = "安装",
        installation = "安装",
        installationError = "❌ 安装错误",
        installationStatus = "安装状态",
        installationSuccess = "✅ 安装成功",
        installed = "%0 已安装",
        language = "语言",
        logging = "记录日志",
        modifyInstallation = "配置安装",
        openDataDirectory = "打开数据目录",
        openLatestReleasePage = "最新发布页面",
        openLogFile = "打开日志文件",
        openOfficialForumTopic = "官方论坛主题",
        overrideAppStatus = "覆写游戏状态",
        overrideDlcStatus = "覆写DLC状态",
        notInstalled = "未安装",
        processStatusRunning = "运行中",
        processStatusNotRunning = "未在运行",
        refreshStatus = "刷新状态",
        reloadConfig = "重新加载配置",
        reloadConfigTooltip = "在Steam进程运行时重载配置文件",
        reloadConfigSuccess = "✅ 配置文件已重新载入",
        reloadConfigError = "❌ 重载配置文件失败",
        restoreDefaultConfiguration = "恢复默认配置",
        settings = "设置",
        startPage = "主页",
        startPageWelcome = "欢迎使用 Koalageddon v%0",
        storeMode = "商店模式",
        storeProcessStatus = "%0 进程状态",
        theme = "主题",
        themeDark = "暗色",
        themeLight = "亮色",
        toolConfig = "%0 配置",
        removalError = "❌ 移除错误信息",
        removalSuccess = "✅ 移除成功信息",
        remove = "移除",
        unlocker = "解锁工具",
        unlockFamilySharing = "解锁家庭共享",
        version = "版本 v%0",
    )
}
