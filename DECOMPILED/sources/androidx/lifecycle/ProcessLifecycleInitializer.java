package androidx.lifecycle;

import android.content.Context;
import androidx.startup.C2807a;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p050G0.InterfaceC0467a;
import p152T5.AbstractC1638q;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0467a {
    @Override // p050G0.InterfaceC0467a
    /* JADX INFO: renamed from: a */
    public List mo2029a() {
        return AbstractC1638q.m6765j();
    }

    @Override // p050G0.InterfaceC0467a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC2657s mo2030b(Context context) {
        AbstractC6118n.m27187e(context, "context");
        C2807a c2807aM13988e = C2807a.m13988e(context);
        AbstractC6118n.m27186d(c2807aM13988e, "getInstance(...)");
        if (!c2807aM13988e.m13993g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C2653o.m12639a(context);
        C2615G.b bVar = C2615G.f10393t;
        bVar.m12540b(context);
        return bVar.m12539a();
    }
}
