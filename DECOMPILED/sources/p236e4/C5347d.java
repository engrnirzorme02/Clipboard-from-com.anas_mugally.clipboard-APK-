package p236e4;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import p228d4.C5235g;
import p244f4.InterfaceC5437a;
import p244f4.InterfaceC5438b;

/* JADX INFO: renamed from: e4.d */
/* JADX INFO: loaded from: classes.dex */
public class C5347d implements InterfaceC5345b, InterfaceC5438b {

    /* JADX INFO: renamed from: a */
    private InterfaceC5437a f20454a;

    /* JADX INFO: renamed from: c */
    private static String m24336c(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // p244f4.InterfaceC5438b
    /* JADX INFO: renamed from: a */
    public void mo14979a(InterfaceC5437a interfaceC5437a) {
        this.f20454a = interfaceC5437a;
        C5235g.m24179f().m24180b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // p236e4.InterfaceC5345b
    /* JADX INFO: renamed from: b */
    public void mo24335b(String str, Bundle bundle) {
        InterfaceC5437a interfaceC5437a = this.f20454a;
        if (interfaceC5437a != null) {
            try {
                interfaceC5437a.mo24643a("$A$:" + m24336c(str, bundle));
            } catch (JSONException unused) {
                C5235g.m24179f().m24188k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
