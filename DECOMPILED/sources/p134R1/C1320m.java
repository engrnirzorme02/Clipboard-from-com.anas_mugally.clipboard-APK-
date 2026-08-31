package p134R1;

import android.content.Context;
import androidx.fragment.app.AbstractC2599q;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import androidx.lifecycle.AbstractC2650l;
import com.bumptech.glide.ComponentCallbacks2C3202b;
import com.bumptech.glide.ComponentCallbacks2C3212l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: R1.m */
/* JADX INFO: loaded from: classes.dex */
final class C1320m {

    /* JADX INFO: renamed from: a */
    final Map f4608a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final C1322o.b f4609b;

    /* JADX INFO: renamed from: R1.m$a */
    class a implements InterfaceC1319l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC2650l f4610a;

        a(AbstractC2650l abstractC2650l) {
            this.f4610a = abstractC2650l;
        }

        @Override // p134R1.InterfaceC1319l
        /* JADX INFO: renamed from: a */
        public void mo5654a() {
        }

        @Override // p134R1.InterfaceC1319l
        /* JADX INFO: renamed from: e */
        public void mo5655e() {
        }

        @Override // p134R1.InterfaceC1319l
        public void onDestroy() {
            C1320m.this.f4608a.remove(this.f4610a);
        }
    }

    /* JADX INFO: renamed from: R1.m$b */
    private final class b implements InterfaceC1323p {

        /* JADX INFO: renamed from: a */
        private final AbstractC2599q f4612a;

        b(AbstractC2599q abstractC2599q) {
            this.f4612a = abstractC2599q;
        }

        /* JADX INFO: renamed from: b */
        private void m5661b(AbstractC2599q abstractC2599q, Set set) {
            List listM12401u0 = abstractC2599q.m12401u0();
            int size = listM12401u0.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) listM12401u0.get(i7);
                m5661b(abstractComponentCallbacksC2591i.m12201t(), set);
                ComponentCallbacks2C3212l componentCallbacks2C3212lM5659a = C1320m.this.m5659a(abstractComponentCallbacksC2591i.mo419P());
                if (componentCallbacks2C3212lM5659a != null) {
                    set.add(componentCallbacks2C3212lM5659a);
                }
            }
        }

        @Override // p134R1.InterfaceC1323p
        /* JADX INFO: renamed from: a */
        public Set mo5657a() {
            HashSet hashSet = new HashSet();
            m5661b(this.f4612a, hashSet);
            return hashSet;
        }
    }

    C1320m(C1322o.b bVar) {
        this.f4609b = bVar;
    }

    /* JADX INFO: renamed from: a */
    ComponentCallbacks2C3212l m5659a(AbstractC2650l abstractC2650l) {
        AbstractC2023l.m8410a();
        return (ComponentCallbacks2C3212l) this.f4608a.get(abstractC2650l);
    }

    /* JADX INFO: renamed from: b */
    ComponentCallbacks2C3212l m5660b(Context context, ComponentCallbacks2C3202b componentCallbacks2C3202b, AbstractC2650l abstractC2650l, AbstractC2599q abstractC2599q, boolean z7) {
        AbstractC2023l.m8410a();
        ComponentCallbacks2C3212l componentCallbacks2C3212lM5659a = m5659a(abstractC2650l);
        if (componentCallbacks2C3212lM5659a != null) {
            return componentCallbacks2C3212lM5659a;
        }
        C1318k c1318k = new C1318k(abstractC2650l);
        ComponentCallbacks2C3212l componentCallbacks2C3212lMo5669a = this.f4609b.mo5669a(componentCallbacks2C3202b, c1318k, new b(abstractC2599q), context);
        this.f4608a.put(abstractC2650l, componentCallbacks2C3212lMo5669a);
        c1318k.mo5648a(new a(abstractC2650l));
        if (z7) {
            componentCallbacks2C3212lMo5669a.mo5654a();
        }
        return componentCallbacks2C3212lMo5669a;
    }
}
