package p316o4;

import org.json.JSONObject;
import p252g4.InterfaceC5464B;

/* JADX INFO: renamed from: o4.b */
/* JADX INFO: loaded from: classes.dex */
class C6581b implements InterfaceC6588i {
    C6581b() {
    }

    /* JADX INFO: renamed from: b */
    static C6583d m27893b(InterfaceC5464B interfaceC5464B) {
        return new C6583d(interfaceC5464B.mo24673a() + ((long) 3600000), new C6583d.b(8, 4), new C6583d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // p316o4.InterfaceC6588i
    /* JADX INFO: renamed from: a */
    public C6583d mo27894a(InterfaceC5464B interfaceC5464B, JSONObject jSONObject) {
        return m27893b(interfaceC5464B);
    }
}
