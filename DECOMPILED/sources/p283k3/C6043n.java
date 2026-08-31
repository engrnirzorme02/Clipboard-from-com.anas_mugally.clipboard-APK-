package p283k3;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.measurement.internal.C4164X2;
import com.google.android.gms.measurement.internal.C4313q2;

/* JADX INFO: renamed from: k3.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C6043n {

    /* JADX INFO: renamed from: a */
    private final InterfaceC6042m f23812a;

    public C6043n(InterfaceC6042m interfaceC6042m) {
        AbstractC3718s.m18083l(interfaceC6042m);
        this.f23812a = interfaceC6042m;
    }

    /* JADX INFO: renamed from: a */
    public final void m27049a(Context context, Intent intent) {
        C4164X2 c4164x2M18653O = C4164X2.m18653O(context, null, null);
        C4313q2 c4313q2Mo18421a = c4164x2M18653O.mo18421a();
        if (intent == null) {
            c4313q2Mo18421a.m18854r().m18834a("Receiver called with null intent");
            return;
        }
        c4164x2M18653O.mo18423c();
        String action = intent.getAction();
        c4313q2Mo18421a.m18859w().m18835b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c4313q2Mo18421a.m18854r().m18834a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c4313q2Mo18421a.m18859w().m18834a("Starting wakeful intent.");
            this.f23812a.mo18410a(context, className);
        }
    }
}
