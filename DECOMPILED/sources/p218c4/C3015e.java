package p218c4;

import android.os.Bundle;
import java.util.Locale;
import p171W3.InterfaceC1862a;
import p228d4.C5235g;
import p236e4.InterfaceC5345b;

/* JADX INFO: renamed from: c4.e */
/* JADX INFO: loaded from: classes.dex */
class C3015e implements InterfaceC1862a.b {

    /* JADX INFO: renamed from: a */
    private InterfaceC5345b f12442a;

    /* JADX INFO: renamed from: b */
    private InterfaceC5345b f12443b;

    C3015e() {
    }

    /* JADX INFO: renamed from: b */
    private static void m14988b(InterfaceC5345b interfaceC5345b, String str, Bundle bundle) {
        if (interfaceC5345b == null) {
            return;
        }
        interfaceC5345b.mo24335b(str, bundle);
    }

    /* JADX INFO: renamed from: c */
    private void m14989c(String str, Bundle bundle) {
        m14988b("clx".equals(bundle.getString("_o")) ? this.f12442a : this.f12443b, str, bundle);
    }

    @Override // p171W3.InterfaceC1862a.b
    /* JADX INFO: renamed from: a */
    public void mo7657a(int i7, Bundle bundle) {
        String string;
        C5235g.m24179f().m24186i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i7), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        m14989c(string, bundle2);
    }

    /* JADX INFO: renamed from: d */
    public void m14990d(InterfaceC5345b interfaceC5345b) {
        this.f12443b = interfaceC5345b;
    }

    /* JADX INFO: renamed from: e */
    public void m14991e(InterfaceC5345b interfaceC5345b) {
        this.f12442a = interfaceC5345b;
    }
}
