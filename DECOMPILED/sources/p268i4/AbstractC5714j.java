package p268i4;

import org.json.JSONObject;
import p086K4.InterfaceC0745a;
import p102M4.C0899d;
import p276j4.AbstractC5868F;

/* JADX INFO: renamed from: i4.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5714j {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0745a f21812a = new C0899d().m4077j(C5705a.f21763a).m4076i();

    /* JADX INFO: renamed from: a */
    static AbstractC5714j m25342a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return m25343b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC5714j m25343b(String str, String str2, String str3, String str4, long j7) {
        return new C5706b(str, str2, m25344i(str3), str4, j7);
    }

    /* JADX INFO: renamed from: i */
    private static String m25344i(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo25267c();

    /* JADX INFO: renamed from: d */
    public abstract String mo25268d();

    /* JADX INFO: renamed from: e */
    public abstract String mo25269e();

    /* JADX INFO: renamed from: f */
    public abstract long mo25270f();

    /* JADX INFO: renamed from: g */
    public abstract String mo25271g();

    /* JADX INFO: renamed from: h */
    public AbstractC5868F.e.d.AbstractC7711e m25345h() {
        return AbstractC5868F.e.d.AbstractC7711e.m26575a().mo26583d(AbstractC5868F.e.d.AbstractC7711e.b.m26585a().mo26590c(mo25271g()).mo26589b(mo25269e()).mo26588a()).mo26581b(mo25267c()).mo26582c(mo25268d()).mo26584e(mo25270f()).mo26580a();
    }
}
