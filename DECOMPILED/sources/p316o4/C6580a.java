package p316o4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
import p228d4.C5235g;
import p252g4.AbstractC5499i;
import p300m4.C6346g;

/* JADX INFO: renamed from: o4.a */
/* JADX INFO: loaded from: classes.dex */
public class C6580a {

    /* JADX INFO: renamed from: a */
    private final File f24819a;

    public C6580a(C6346g c6346g) {
        this.f24819a = c6346g.m27340g("com.crashlytics.settings.json");
    }

    /* JADX INFO: renamed from: a */
    private File m27890a() {
        return this.f24819a;
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m27891b() throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C5235g.m24179f().m24180b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileM27890a = m27890a();
                if (fileM27890a.exists()) {
                    fileInputStream = new FileInputStream(fileM27890a);
                    try {
                        jSONObject = new JSONObject(AbstractC5499i.m24782B(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e7) {
                        e = e7;
                        C5235g.m24179f().m24183e("Failed to fetch cached settings", e);
                        AbstractC5499i.m24788f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    C5235g.m24179f().m24186i("Settings file does not exist.");
                    jSONObject = null;
                }
                AbstractC5499i.m24788f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                AbstractC5499i.m24788f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            AbstractC5499i.m24788f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m27892c(long j7, JSONObject jSONObject) throws Throwable {
        C5235g.m24179f().m24186i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j7);
                FileWriter fileWriter2 = new FileWriter(m27890a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    AbstractC5499i.m24788f(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e7) {
                    e = e7;
                    fileWriter = fileWriter2;
                    C5235g.m24179f().m24183e("Failed to cache settings", e);
                    AbstractC5499i.m24788f(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    AbstractC5499i.m24788f(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e8) {
            e = e8;
        }
    }
}
