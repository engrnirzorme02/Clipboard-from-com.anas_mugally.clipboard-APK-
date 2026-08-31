package com.anas_mugally.clipboard.p221ui;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AbstractActivityC2242c;
import com.anas_mugally.clipboard.C3065o;
import com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d;
import com.google.android.material.snackbar.Snackbar;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p017C.AbstractC0101b;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1440r;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1610H;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC3140d extends AbstractActivityC2242c {

    /* JADX INFO: renamed from: S */
    public static final a f13130S = new a(null);

    /* JADX INFO: renamed from: O */
    private String[] f13131O;

    /* JADX INFO: renamed from: Q */
    private InterfaceC5356a f13133Q;

    /* JADX INFO: renamed from: P */
    private boolean f13132P = true;

    /* JADX INFO: renamed from: R */
    private final InterfaceC1429g f13134R = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: l1.d0
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AbstractActivityC3140d.m16465q1();
        }
    });

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: d1 */
    private final Map m16460d1() {
        Map map = (Map) m16461f1().get(Locale.getDefault().getLanguage());
        if (map != null) {
            return map;
        }
        Object obj = m16461f1().get("en");
        AbstractC6118n.m27184b(obj);
        return (Map) obj;
    }

    /* JADX INFO: renamed from: f1 */
    private final Map m16461f1() {
        return (Map) this.f13134R.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final String m16462h1() {
        return "Can't check permissions for null context";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final void m16463l1(AbstractActivityC3140d abstractActivityC3140d, View view) {
        abstractActivityC3140d.m16470m1();
    }

    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m16464p1(AbstractActivityC3140d abstractActivityC3140d, String[] strArr, boolean z7, InterfaceC5356a interfaceC5356a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestPermission");
        }
        if ((i7 & 2) != 0) {
            z7 = true;
        }
        abstractActivityC3140d.m16472o1(strArr, z7, interfaceC5356a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final Map m16465q1() {
        return AbstractC1610H.m6628j(AbstractC1440r.m6083a("en", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Access denied, this permission is required"), AbstractC1440r.m6083a("settings", "Settings"))), AbstractC1440r.m6083a("ar", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "تم رفض الوصول، هذه الصلاحية مطلوبة"), AbstractC1440r.m6083a("settings", "الإعدادات"))), AbstractC1440r.m6083a("fr", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Accès refusé, cette autorisation est requise"), AbstractC1440r.m6083a("settings", "Paramètres"))), AbstractC1440r.m6083a("de", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Zugriff verweigert, diese Berechtigung ist erforderlich"), AbstractC1440r.m6083a("settings", "Einstellungen"))), AbstractC1440r.m6083a("pt", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Acesso negado, esta permissão é necessária"), AbstractC1440r.m6083a("settings", "Configurações"))), AbstractC1440r.m6083a("it", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Accesso negato, è richiesto questo permesso"), AbstractC1440r.m6083a("settings", "Impostazioni"))), AbstractC1440r.m6083a("ja", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "アクセスが拒否されました。この許可が必要です"), AbstractC1440r.m6083a("settings", "設定"))), AbstractC1440r.m6083a("ko", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "액세스가 거부되었습니다. 이 권한이 필요합니다"), AbstractC1440r.m6083a("settings", "설정"))), AbstractC1440r.m6083a("zh", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "拒绝访问，此权限是必需的"), AbstractC1440r.m6083a("settings", "设置"))), AbstractC1440r.m6083a("ru", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Доступ запрещен, необходимо это разрешение"), AbstractC1440r.m6083a("settings", "Настройки"))), AbstractC1440r.m6083a("sk", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Prístup odmietnutý, táto povolenie je potrebné"), AbstractC1440r.m6083a("settings", "Nastavenia"))), AbstractC1440r.m6083a("cs", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Odepřen přístup, tato oprávnění jsou vyžadována"), AbstractC1440r.m6083a("settings", "Nastavení"))), AbstractC1440r.m6083a("da", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Adgang nægtet, dette tilladelse er påkrævet"), AbstractC1440r.m6083a("settings", "Indstillinger"))), AbstractC1440r.m6083a("bg", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Отказан достъп, това разрешение е необходимо"), AbstractC1440r.m6083a("settings", "Настройки"))), AbstractC1440r.m6083a("ro", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Accesul interzis, această permisiune este necesară"), AbstractC1440r.m6083a("settings", "Setări"))), AbstractC1440r.m6083a("ca", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Accés denegat, aquest permís és necessari"), AbstractC1440r.m6083a("settings", "Configuració"))), AbstractC1440r.m6083a("nl", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Toegang geweigerd, deze toestemming is vereist"), AbstractC1440r.m6083a("settings", "Instellingen"))), AbstractC1440r.m6083a("et", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Juurdepääs keelatud, see luba on vajalik"), AbstractC1440r.m6083a("settings", "Seaded"))), AbstractC1440r.m6083a("fi", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Pääsy kielletty, tämä lupa vaaditaan"), AbstractC1440r.m6083a("settings", "Asetukset"))), AbstractC1440r.m6083a("el", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Αρνήθηκε η πρόσβαση, αυτή η άδεια είναι απαραίτητη"), AbstractC1440r.m6083a("settings", "Ρυθμίσεις"))), AbstractC1440r.m6083a("he", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "גישה נדחתה, נדרשת הרשאה זו"), AbstractC1440r.m6083a("settings", "הגדרות"))), AbstractC1440r.m6083a("hu", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Hozzáférés megtagadva, ez az engedély szükséges"), AbstractC1440r.m6083a("settings", "Beállítások"))), AbstractC1440r.m6083a("hi", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "पहुंच निषेधित, यह अनुमति आवश्यक है"), AbstractC1440r.m6083a("settings", "सेटिंग्स"))), AbstractC1440r.m6083a("is", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Aðgangur bannaður, þetta leyfi er nauðsynlegt"), AbstractC1440r.m6083a("settings", "Stillingar"))), AbstractC1440r.m6083a("la", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Aditus prohibitus, hoc permisso opus est"), AbstractC1440r.m6083a("settings", "Options"))), AbstractC1440r.m6083a("lt", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Prieigos atsisakyta, šio leidimo reikia"), AbstractC1440r.m6083a("settings", "Nustatymai"))), AbstractC1440r.m6083a("lb", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Accès refusé, dës Erlaabnis gëtt néideg"), AbstractC1440r.m6083a("settings", "Astellungen"))), AbstractC1440r.m6083a("no", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Tilgang nektet, dette tillatelsen er påkrevd"), AbstractC1440r.m6083a("settings", "Innstillinger"))), AbstractC1440r.m6083a("pl", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Odmowa dostępu, ta zgoda jest wymagana"), AbstractC1440r.m6083a("settings", "Ustawienia"))), AbstractC1440r.m6083a("sr", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Приступ одбијен, ова овлашћења су потребна"), AbstractC1440r.m6083a("settings", "Подешавања"))), AbstractC1440r.m6083a("sl", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Dostop zavrnjen, to dovoljenje je potrebno"), AbstractC1440r.m6083a("settings", "Nastavitve"))), AbstractC1440r.m6083a("es", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Acceso denegado, se requiere este permiso"), AbstractC1440r.m6083a("settings", "Configuración"))), AbstractC1440r.m6083a("sv", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Åtkomst nekad, den här behörigheten krävs"), AbstractC1440r.m6083a("settings", "Inställningar"))), AbstractC1440r.m6083a("th", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "ปฏิเสธการเข้าถึง จำเป็นต้องใช้สิทธิ์นี้"), AbstractC1440r.m6083a("settings", "การตั้งค่า"))), AbstractC1440r.m6083a("tr", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Erişim reddedildi, bu izin gereklidir"), AbstractC1440r.m6083a("settings", "Ayarlar"))), AbstractC1440r.m6083a("uk", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Доступ заборонено, потрібно це дозвіл"), AbstractC1440r.m6083a("settings", "Налаштування"))), AbstractC1440r.m6083a("vi", AbstractC1610H.m6628j(AbstractC1440r.m6083a("text", "Từ chối truy cập, cần phải có quyền này"), AbstractC1440r.m6083a("settings", "Cài đặt"))));
    }

    /* JADX INFO: renamed from: e1 */
    protected final boolean m16466e1() {
        return Build.VERSION.SDK_INT >= 33;
    }

    /* JADX INFO: renamed from: g1 */
    protected final boolean m16467g1(String... perms) {
        AbstractC6118n.m27187e(perms, "perms");
        new InterfaceC5356a() { // from class: l1.b0
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AbstractActivityC3140d.m16462h1();
            }
        };
        for (String str : perms) {
            AbstractC6118n.m27184b(str);
            if (checkSelfPermission(str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i1 */
    protected final boolean m16468i1(String permission) {
        AbstractC6118n.m27187e(permission, "permission");
        return !AbstractC0101b.m389e(this, permission);
    }

    /* JADX INFO: renamed from: j1 */
    protected void m16469j1(String[] permissions) {
        AbstractC6118n.m27187e(permissions, "permissions");
    }

    /* JADX INFO: renamed from: k1 */
    protected void mo15616k1(String[] permissions) {
        AbstractC6118n.m27187e(permissions, "permissions");
    }

    /* JADX INFO: renamed from: m1 */
    protected final void m16470m1() {
        String packageName = getPackageName();
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", packageName, null));
        startActivityForResult(intent, 456);
    }

    /* JADX INFO: renamed from: n1 */
    protected final void m16471n1() {
        if (m16466e1() && !m16467g1("android.permission.POST_NOTIFICATIONS") && m16468i1("android.permission.POST_NOTIFICATIONS")) {
            m16472o1(new String[]{"android.permission.POST_NOTIFICATIONS"}, false, null);
        }
    }

    /* JADX INFO: renamed from: o1 */
    protected final void m16472o1(String[] permissions, boolean z7, InterfaceC5356a interfaceC5356a) {
        AbstractC6118n.m27187e(permissions, "permissions");
        this.f13133Q = interfaceC5356a;
        this.f13132P = z7;
        this.f13131O = permissions;
        requestPermissions(permissions, 123);
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        String[] strArr;
        super.onActivityResult(i7, i8, intent);
        if (i7 != 456 || (strArr = this.f13131O) == null) {
            return;
        }
        if (!m16467g1((String[]) Arrays.copyOf(strArr, strArr.length))) {
            m16469j1(strArr);
            return;
        }
        InterfaceC5356a interfaceC5356a = this.f13133Q;
        if (interfaceC5356a != null) {
            interfaceC5356a.invoke();
        }
        mo15616k1(strArr);
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m16471n1();
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        AbstractC6118n.m27187e(permissions, "permissions");
        AbstractC6118n.m27187e(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        if (i7 == 123) {
            if (!(grantResults.length == 0) && grantResults[0] == 0) {
                C3065o.f12624f.m15175a(this).m15170l(true);
                InterfaceC5356a interfaceC5356a = this.f13133Q;
                if (interfaceC5356a != null) {
                    interfaceC5356a.invoke();
                }
                mo15616k1(permissions);
                return;
            }
            if (this.f13132P) {
                View viewFindViewById = findViewById(R.id.content);
                Object obj = m16460d1().get("text");
                AbstractC6118n.m27184b(obj);
                Snackbar.m21283i0(viewFindViewById, (CharSequence) obj, -2).m21285k0((CharSequence) m16460d1().get("settings"), new View.OnClickListener() { // from class: l1.c0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractActivityC3140d.m16463l1(this.f24009a, view);
                    }
                }).mo21259U();
            }
            m16469j1(permissions);
        }
    }
}
