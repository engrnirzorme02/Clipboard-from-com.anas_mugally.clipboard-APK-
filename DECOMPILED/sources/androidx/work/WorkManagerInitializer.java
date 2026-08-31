package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p050G0.InterfaceC0467a;
import p112O0.AbstractC1097j;
import p112O0.AbstractC1107t;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC0467a {

    /* JADX INFO: renamed from: a */
    private static final String f11843a = AbstractC1097j.m4846f("WrkMgrInitializer");

    @Override // p050G0.InterfaceC0467a
    /* JADX INFO: renamed from: a */
    public List mo2029a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p050G0.InterfaceC0467a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC1107t mo2030b(Context context) {
        AbstractC1097j.m4844c().mo4847a(f11843a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        AbstractC1107t.m4863e(context, new C2895a.b().m14493a());
        return AbstractC1107t.m4862d(context);
    }
}
