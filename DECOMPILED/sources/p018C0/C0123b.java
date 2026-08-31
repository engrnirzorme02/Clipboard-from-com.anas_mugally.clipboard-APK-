package p018C0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.InterfaceC2654p;
import androidx.lifecycle.InterfaceC2657s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p010B0.AbstractC0044c;
import p010B0.AbstractC0051j;
import p010B0.C0047f;
import p010B0.InterfaceC0050i;
import p081K.AbstractC0712d;
import p145S5.AbstractC1440r;
import p145S5.C1435m;
import p145S5.C1444v;
import p152T5.AbstractC1610H;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: C0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0123b {

    /* JADX INFO: renamed from: i */
    private static final a f665i = new a(null);

    /* JADX INFO: renamed from: a */
    private final InterfaceC0050i f666a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5356a f667b;

    /* JADX INFO: renamed from: c */
    private final C0124c f668c;

    /* JADX INFO: renamed from: d */
    private final Map f669d;

    /* JADX INFO: renamed from: e */
    private boolean f670e;

    /* JADX INFO: renamed from: f */
    private Bundle f671f;

    /* JADX INFO: renamed from: g */
    private boolean f672g;

    /* JADX INFO: renamed from: h */
    private boolean f673h;

    /* JADX INFO: renamed from: C0.b$a */
    private static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public C0123b(InterfaceC0050i owner, InterfaceC5356a onAttach) {
        AbstractC6118n.m27187e(owner, "owner");
        AbstractC6118n.m27187e(onAttach, "onAttach");
        this.f666a = owner;
        this.f667b = onAttach;
        this.f668c = new C0124c();
        this.f669d = new LinkedHashMap();
        this.f673h = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m578g(C0123b c0123b, InterfaceC2657s interfaceC2657s, AbstractC2650l.a event) {
        AbstractC6118n.m27187e(interfaceC2657s, "<unused var>");
        AbstractC6118n.m27187e(event, "event");
        if (event == AbstractC2650l.a.ON_START) {
            c0123b.f673h = true;
        } else if (event == AbstractC2650l.a.ON_STOP) {
            c0123b.f673h = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m579c(String key) {
        AbstractC6118n.m27187e(key, "key");
        if (!this.f672g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.f671f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM176a = AbstractC0044c.m176a(bundle);
        Bundle bundleM178c = AbstractC0044c.m177b(bundleM176a, key) ? AbstractC0044c.m178c(bundleM176a, key) : null;
        AbstractC0051j.m203e(AbstractC0051j.m199a(bundle), key);
        if (AbstractC0044c.m181f(AbstractC0044c.m176a(bundle))) {
            this.f671f = null;
        }
        return bundleM178c;
    }

    /* JADX INFO: renamed from: d */
    public final C0047f.b m580d(String key) {
        C0047f.b bVar;
        AbstractC6118n.m27187e(key, "key");
        synchronized (this.f668c) {
            Iterator it = this.f669d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                C0047f.b bVar2 = (C0047f.b) entry.getValue();
                if (AbstractC6118n.m27183a(str, key)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m581e() {
        return this.f673h;
    }

    /* JADX INFO: renamed from: f */
    public final void m582f() {
        if (this.f666a.mo419P().mo12626b() != AbstractC2650l.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f670e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f667b.invoke();
        this.f666a.mo419P().mo12625a(new InterfaceC2654p() { // from class: C0.a
            @Override // androidx.lifecycle.InterfaceC2654p
            /* JADX INFO: renamed from: n */
            public final void mo173n(InterfaceC2657s interfaceC2657s, AbstractC2650l.a aVar) {
                C0123b.m578g(this.f664a, interfaceC2657s, aVar);
            }
        });
        this.f670e = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m583h(Bundle bundle) {
        if (!this.f670e) {
            m582f();
        }
        if (this.f666a.mo419P().mo12626b().m12634d(AbstractC2650l.b.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.f666a.mo419P().mo12626b()).toString());
        }
        if (this.f672g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleM178c = null;
        if (bundle != null) {
            Bundle bundleM176a = AbstractC0044c.m176a(bundle);
            if (AbstractC0044c.m177b(bundleM176a, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleM178c = AbstractC0044c.m178c(bundleM176a, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.f671f = bundleM178c;
        this.f672g = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m584i(Bundle outBundle) {
        C1435m[] c1435mArr;
        AbstractC6118n.m27187e(outBundle, "outBundle");
        Map mapH = AbstractC1610H.m6626h();
        if (mapH.isEmpty()) {
            c1435mArr = new C1435m[0];
        } else {
            ArrayList arrayList = new ArrayList(mapH.size());
            for (Map.Entry entry : mapH.entrySet()) {
                arrayList.add(AbstractC1440r.m6083a((String) entry.getKey(), entry.getValue()));
            }
            c1435mArr = (C1435m[]) arrayList.toArray(new C1435m[0]);
        }
        Bundle bundleM3458a = AbstractC0712d.m3458a((C1435m[]) Arrays.copyOf(c1435mArr, c1435mArr.length));
        Bundle bundleM199a = AbstractC0051j.m199a(bundleM3458a);
        Bundle bundle = this.f671f;
        if (bundle != null) {
            AbstractC0051j.m200b(bundleM199a, bundle);
        }
        synchronized (this.f668c) {
            try {
                for (Map.Entry entry2 : this.f669d.entrySet()) {
                    AbstractC0051j.m201c(bundleM199a, (String) entry2.getKey(), ((C0047f.b) entry2.getValue()).mo174a());
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (AbstractC0044c.m181f(AbstractC0044c.m176a(bundleM3458a))) {
            return;
        }
        AbstractC0051j.m201c(AbstractC0051j.m199a(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM3458a);
    }

    /* JADX INFO: renamed from: j */
    public final void m585j(String key, C0047f.b provider) {
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(provider, "provider");
        synchronized (this.f668c) {
            if (this.f669d.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.f669d.put(key, provider);
            C1444v c1444v = C1444v.f4971a;
        }
    }
}
