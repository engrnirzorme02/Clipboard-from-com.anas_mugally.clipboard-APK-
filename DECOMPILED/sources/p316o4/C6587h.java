package p316o4;

import org.json.JSONObject;
import p228d4.C5235g;
import p252g4.InterfaceC5464B;

/* JADX INFO: renamed from: o4.h */
/* JADX INFO: loaded from: classes.dex */
public class C6587h {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5464B f24852a;

    C6587h(InterfaceC5464B interfaceC5464B) {
        this.f24852a = interfaceC5464B;
    }

    /* JADX INFO: renamed from: a */
    private static InterfaceC6588i m27925a(int i7) {
        if (i7 == 3) {
            return new C6592m();
        }
        C5235g.m24179f().m24182d("Could not determine SettingsJsonTransform for settings version " + i7 + ". Using default settings values.");
        return new C6581b();
    }

    /* JADX INFO: renamed from: b */
    public C6583d m27926b(JSONObject jSONObject) {
        return m27925a(jSONObject.getInt("settings_version")).mo27894a(this.f24852a, jSONObject);
    }
}
