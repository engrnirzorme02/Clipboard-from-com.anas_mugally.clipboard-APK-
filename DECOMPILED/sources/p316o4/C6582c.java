package p316o4;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p228d4.C5235g;
import p252g4.C5513w;
import p260h4.C5653i;
import p292l4.C6296a;
import p292l4.C6297b;
import p292l4.C6298c;

/* JADX INFO: renamed from: o4.c */
/* JADX INFO: loaded from: classes.dex */
class C6582c implements InterfaceC6591l {

    /* JADX INFO: renamed from: a */
    private final String f24820a;

    /* JADX INFO: renamed from: b */
    private final C6297b f24821b;

    /* JADX INFO: renamed from: c */
    private final C5235g f24822c;

    public C6582c(String str, C6297b c6297b) {
        this(str, c6297b, C5235g.m24179f());
    }

    /* JADX INFO: renamed from: b */
    private C6296a m27895b(C6296a c6296a, C6590k c6590k) {
        m27896c(c6296a, "X-CRASHLYTICS-GOOGLE-APP-ID", c6590k.f24853a);
        m27896c(c6296a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m27896c(c6296a, "X-CRASHLYTICS-API-CLIENT-VERSION", C5513w.m24885k());
        m27896c(c6296a, "Accept", "application/json");
        m27896c(c6296a, "X-CRASHLYTICS-DEVICE-MODEL", c6590k.f24854b);
        m27896c(c6296a, "X-CRASHLYTICS-OS-BUILD-VERSION", c6590k.f24855c);
        m27896c(c6296a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c6590k.f24856d);
        m27896c(c6296a, "X-CRASHLYTICS-INSTALLATION-ID", c6590k.f24857e.mo24705a().mo24714c());
        return c6296a;
    }

    /* JADX INFO: renamed from: c */
    private void m27896c(C6296a c6296a, String str, String str2) {
        if (str2 != null) {
            c6296a.m27221d(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    private JSONObject m27897e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e7) {
            this.f24822c.m24189l("Failed to parse settings JSON from " + this.f24820a, e7);
            this.f24822c.m24188k("Settings response " + str);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private Map m27898f(C6590k c6590k) {
        HashMap map = new HashMap();
        map.put("build_version", c6590k.f24860h);
        map.put("display_version", c6590k.f24859g);
        map.put("source", Integer.toString(c6590k.f24861i));
        String str = c6590k.f24858f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // p316o4.InterfaceC6591l
    /* JADX INFO: renamed from: a */
    public JSONObject mo27899a(C6590k c6590k, boolean z7) {
        C5653i.m25137d();
        if (!z7) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map mapM27898f = m27898f(c6590k);
            C6296a c6296aM27895b = m27895b(m27900d(mapM27898f), c6590k);
            this.f24822c.m24180b("Requesting settings from " + this.f24820a);
            this.f24822c.m24186i("Settings query params were: " + mapM27898f);
            return m27901g(c6296aM27895b.m27220c());
        } catch (IOException e7) {
            this.f24822c.m24183e("Settings request failed.", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    protected C6296a m27900d(Map map) {
        return this.f24821b.m27222a(this.f24820a, map).m27221d("User-Agent", "Crashlytics Android SDK/" + C5513w.m24885k()).m27221d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* JADX INFO: renamed from: g */
    JSONObject m27901g(C6298c c6298c) {
        int iM27224b = c6298c.m27224b();
        this.f24822c.m24186i("Settings response code was: " + iM27224b);
        if (m27902h(iM27224b)) {
            return m27897e(c6298c.m27223a());
        }
        this.f24822c.m24182d("Settings request failed; (status: " + iM27224b + ") from " + this.f24820a);
        return null;
    }

    /* JADX INFO: renamed from: h */
    boolean m27902h(int i7) {
        return i7 == 200 || i7 == 201 || i7 == 202 || i7 == 203;
    }

    C6582c(String str, C6297b c6297b, C5235g c5235g) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f24822c = c5235g;
        this.f24821b = c6297b;
        this.f24820a = str;
    }
}
