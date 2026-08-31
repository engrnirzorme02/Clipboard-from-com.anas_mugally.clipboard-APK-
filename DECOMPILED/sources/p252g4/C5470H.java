package p252g4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.AbstractC4947g;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p219c5.InterfaceC3022e;
import p228d4.C5235g;
import p260h4.C5653i;

/* JADX INFO: renamed from: g4.H */
/* JADX INFO: loaded from: classes.dex */
public class C5470H implements InterfaceC5471I {

    /* JADX INFO: renamed from: g */
    private static final Pattern f20798g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h */
    private static final String f20799h = Pattern.quote("/");

    /* JADX INFO: renamed from: a */
    private final C5472J f20800a;

    /* JADX INFO: renamed from: b */
    private final Context f20801b;

    /* JADX INFO: renamed from: c */
    private final String f20802c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC3022e f20803d;

    /* JADX INFO: renamed from: e */
    private final C5465C f20804e;

    /* JADX INFO: renamed from: f */
    private InterfaceC5471I.a f20805f;

    public C5470H(Context context, String str, InterfaceC3022e interfaceC3022e, C5465C c5465c) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f20801b = context;
        this.f20802c = str;
        this.f20803d = interfaceC3022e;
        this.f20804e = c5465c;
        this.f20800a = new C5472J();
    }

    /* JADX INFO: renamed from: b */
    private synchronized String m24698b(String str, SharedPreferences sharedPreferences) {
        String strM24700e;
        strM24700e = m24700e(UUID.randomUUID().toString());
        C5235g.m24179f().m24186i("Created new Crashlytics installation ID: " + strM24700e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strM24700e).putString("firebase.installation.id", str).apply();
        return strM24700e;
    }

    /* JADX INFO: renamed from: c */
    static String m24699c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: e */
    private static String m24700e(String str) {
        return f20798g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* JADX INFO: renamed from: k */
    static boolean m24701k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    /* JADX INFO: renamed from: l */
    private String m24702l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    /* JADX INFO: renamed from: m */
    private String m24703m(String str) {
        return str.replaceAll(f20799h, "");
    }

    /* JADX INFO: renamed from: n */
    private boolean m24704n() {
        InterfaceC5471I.a aVar = this.f20805f;
        if (aVar != null) {
            return aVar.mo24716e() == null && this.f20804e.m24680d();
        }
        return true;
    }

    @Override // p252g4.InterfaceC5471I
    /* JADX INFO: renamed from: a */
    public synchronized InterfaceC5471I.a mo24705a() {
        if (!m24704n()) {
            return this.f20805f;
        }
        C5235g.m24179f().m24186i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesM24799q = AbstractC5499i.m24799q(this.f20801b);
        String string = sharedPreferencesM24799q.getString("firebase.installation.id", null);
        C5235g.m24179f().m24186i("Cached Firebase Installation ID: " + string);
        if (this.f20804e.m24680d()) {
            C5469G c5469gM24706d = m24706d(false);
            C5235g.m24179f().m24186i("Fetched Firebase Installation ID: " + c5469gM24706d.m24697b());
            if (c5469gM24706d.m24697b() == null) {
                c5469gM24706d = new C5469G(string == null ? m24699c() : string, null);
            }
            if (Objects.equals(c5469gM24706d.m24697b(), string)) {
                this.f20805f = InterfaceC5471I.a.m24712a(m24702l(sharedPreferencesM24799q), c5469gM24706d);
            } else {
                this.f20805f = InterfaceC5471I.a.m24712a(m24698b(c5469gM24706d.m24697b(), sharedPreferencesM24799q), c5469gM24706d);
            }
        } else if (m24701k(string)) {
            this.f20805f = InterfaceC5471I.a.m24713b(m24702l(sharedPreferencesM24799q));
        } else {
            this.f20805f = InterfaceC5471I.a.m24713b(m24698b(m24699c(), sharedPreferencesM24799q));
        }
        C5235g.m24179f().m24186i("Install IDs: " + this.f20805f);
        return this.f20805f;
    }

    /* JADX INFO: renamed from: d */
    public C5469G m24706d(boolean z7) {
        String strMo22197b;
        C5653i.m25138e();
        String str = null;
        if (z7) {
            try {
                strMo22197b = ((AbstractC4947g) Tasks.await(this.f20803d.mo14992a(false), 10000L, TimeUnit.MILLISECONDS)).mo22197b();
            } catch (Exception e7) {
                C5235g.m24179f().m24189l("Error getting Firebase authentication token.", e7);
                strMo22197b = null;
            }
        } else {
            strMo22197b = null;
        }
        try {
            str = (String) Tasks.await(this.f20803d.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e8) {
            C5235g.m24179f().m24189l("Error getting Firebase installation id.", e8);
        }
        return new C5469G(str, strMo22197b);
    }

    /* JADX INFO: renamed from: f */
    public String m24707f() {
        return this.f20802c;
    }

    /* JADX INFO: renamed from: g */
    public String m24708g() {
        return this.f20800a.m24718a(this.f20801b);
    }

    /* JADX INFO: renamed from: h */
    public String m24709h() {
        return String.format(Locale.US, "%s/%s", m24703m(Build.MANUFACTURER), m24703m(Build.MODEL));
    }

    /* JADX INFO: renamed from: i */
    public String m24710i() {
        return m24703m(Build.VERSION.INCREMENTAL);
    }

    /* JADX INFO: renamed from: j */
    public String m24711j() {
        return m24703m(Build.VERSION.RELEASE);
    }
}
