package p264i0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC2599q;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;

/* JADX INFO: renamed from: i0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5662c {

    /* JADX INFO: renamed from: a */
    public static final C5662c f21650a = new C5662c();

    /* JADX INFO: renamed from: b */
    private static c f21651b = c.f21663d;

    /* JADX INFO: renamed from: i0.c$a */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* JADX INFO: renamed from: i0.c$b */
    public interface b {
    }

    /* JADX INFO: renamed from: i0.c$c */
    public static final class c {

        /* JADX INFO: renamed from: c */
        public static final a f21662c = new a(null);

        /* JADX INFO: renamed from: d */
        public static final c f21663d = new c(AbstractC1617O.m6650d(), null, AbstractC1610H.m6626h());

        /* JADX INFO: renamed from: a */
        private final Set f21664a;

        /* JADX INFO: renamed from: b */
        private final Map f21665b;

        /* JADX INFO: renamed from: i0.c$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC6112h abstractC6112h) {
                this();
            }

            private a() {
            }
        }

        public c(Set flags, b bVar, Map allowedViolations) {
            AbstractC6118n.m27187e(flags, "flags");
            AbstractC6118n.m27187e(allowedViolations, "allowedViolations");
            this.f21664a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f21665b = linkedHashMap;
        }

        /* JADX INFO: renamed from: a */
        public final Set m25191a() {
            return this.f21664a;
        }

        /* JADX INFO: renamed from: b */
        public final b m25192b() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final Map m25193c() {
            return this.f21665b;
        }
    }

    private C5662c() {
    }

    /* JADX INFO: renamed from: b */
    private final c m25177b(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        while (abstractComponentCallbacksC2591i != null) {
            if (abstractComponentCallbacksC2591i.m12169g0()) {
                AbstractC2599q abstractC2599qM12132K = abstractComponentCallbacksC2591i.m12132K();
                AbstractC6118n.m27186d(abstractC2599qM12132K, "declaringFragment.parentFragmentManager");
                if (abstractC2599qM12132K.m12329B0() != null) {
                    c cVarM12329B0 = abstractC2599qM12132K.m12329B0();
                    AbstractC6118n.m27184b(cVarM12329B0);
                    return cVarM12329B0;
                }
            }
            abstractComponentCallbacksC2591i = abstractComponentCallbacksC2591i.m12129J();
        }
        return f21651b;
    }

    /* JADX INFO: renamed from: c */
    private final void m25178c(c cVar, final AbstractC5669j abstractC5669j) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM25194a = abstractC5669j.m25194a();
        final String name = abstractComponentCallbacksC2591iM25194a.getClass().getName();
        if (cVar.m25191a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, abstractC5669j);
        }
        cVar.m25192b();
        if (cVar.m25191a().contains(a.PENALTY_DEATH)) {
            m25188m(abstractComponentCallbacksC2591iM25194a, new Runnable() { // from class: i0.b
                @Override // java.lang.Runnable
                public final void run() {
                    C5662c.m25179d(name, abstractC5669j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m25179d(String str, AbstractC5669j violation) {
        AbstractC6118n.m27187e(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    /* JADX INFO: renamed from: e */
    private final void m25180e(AbstractC5669j abstractC5669j) {
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + abstractC5669j.m25194a().getClass().getName(), abstractC5669j);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m25181f(AbstractComponentCallbacksC2591i fragment, String previousFragmentId) {
        AbstractC6118n.m27187e(fragment, "fragment");
        AbstractC6118n.m27187e(previousFragmentId, "previousFragmentId");
        C5660a c5660a = new C5660a(fragment, previousFragmentId);
        C5662c c5662c = f21650a;
        c5662c.m25180e(c5660a);
        c cVarM25177b = c5662c.m25177b(fragment);
        if (cVarM25177b.m25191a().contains(a.DETECT_FRAGMENT_REUSE) && c5662c.m25189n(cVarM25177b, fragment.getClass(), c5660a.getClass())) {
            c5662c.m25178c(cVarM25177b, c5660a);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m25182g(AbstractComponentCallbacksC2591i fragment, ViewGroup viewGroup) {
        AbstractC6118n.m27187e(fragment, "fragment");
        C5663d c5663d = new C5663d(fragment, viewGroup);
        C5662c c5662c = f21650a;
        c5662c.m25180e(c5663d);
        c cVarM25177b = c5662c.m25177b(fragment);
        if (cVarM25177b.m25191a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && c5662c.m25189n(cVarM25177b, fragment.getClass(), c5663d.getClass())) {
            c5662c.m25178c(cVarM25177b, c5663d);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m25183h(AbstractComponentCallbacksC2591i fragment) {
        AbstractC6118n.m27187e(fragment, "fragment");
        C5664e c5664e = new C5664e(fragment);
        C5662c c5662c = f21650a;
        c5662c.m25180e(c5664e);
        c cVarM25177b = c5662c.m25177b(fragment);
        if (cVarM25177b.m25191a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c5662c.m25189n(cVarM25177b, fragment.getClass(), c5664e.getClass())) {
            c5662c.m25178c(cVarM25177b, c5664e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m25184i(AbstractComponentCallbacksC2591i fragment) {
        AbstractC6118n.m27187e(fragment, "fragment");
        C5666g c5666g = new C5666g(fragment);
        C5662c c5662c = f21650a;
        c5662c.m25180e(c5666g);
        c cVarM25177b = c5662c.m25177b(fragment);
        if (cVarM25177b.m25191a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && c5662c.m25189n(cVarM25177b, fragment.getClass(), c5666g.getClass())) {
            c5662c.m25178c(cVarM25177b, c5666g);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m25185j(AbstractComponentCallbacksC2591i fragment, boolean z7) {
        AbstractC6118n.m27187e(fragment, "fragment");
        C5667h c5667h = new C5667h(fragment, z7);
        C5662c c5662c = f21650a;
        c5662c.m25180e(c5667h);
        c cVarM25177b = c5662c.m25177b(fragment);
        if (cVarM25177b.m25191a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && c5662c.m25189n(cVarM25177b, fragment.getClass(), c5667h.getClass())) {
            c5662c.m25178c(cVarM25177b, c5667h);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m25186k(AbstractComponentCallbacksC2591i fragment, ViewGroup container) {
        AbstractC6118n.m27187e(fragment, "fragment");
        AbstractC6118n.m27187e(container, "container");
        C5670k c5670k = new C5670k(fragment, container);
        C5662c c5662c = f21650a;
        c5662c.m25180e(c5670k);
        c cVarM25177b = c5662c.m25177b(fragment);
        if (cVarM25177b.m25191a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && c5662c.m25189n(cVarM25177b, fragment.getClass(), c5670k.getClass())) {
            c5662c.m25178c(cVarM25177b, c5670k);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m25187l(AbstractComponentCallbacksC2591i fragment, AbstractComponentCallbacksC2591i expectedParentFragment, int i7) {
        AbstractC6118n.m27187e(fragment, "fragment");
        AbstractC6118n.m27187e(expectedParentFragment, "expectedParentFragment");
        C5671l c5671l = new C5671l(fragment, expectedParentFragment, i7);
        C5662c c5662c = f21650a;
        c5662c.m25180e(c5671l);
        c cVarM25177b = c5662c.m25177b(fragment);
        if (cVarM25177b.m25191a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && c5662c.m25189n(cVarM25177b, fragment.getClass(), c5671l.getClass())) {
            c5662c.m25178c(cVarM25177b, c5671l);
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m25188m(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Runnable runnable) {
        if (!abstractComponentCallbacksC2591i.m12169g0()) {
            runnable.run();
            return;
        }
        Handler handlerM12270k = abstractComponentCallbacksC2591i.m12132K().m12403v0().m12270k();
        AbstractC6118n.m27186d(handlerM12270k, "fragment.parentFragmentManager.host.handler");
        if (AbstractC6118n.m27183a(handlerM12270k.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerM12270k.post(runnable);
        }
    }

    /* JADX INFO: renamed from: n */
    private final boolean m25189n(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.m25193c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (AbstractC6118n.m27183a(cls2.getSuperclass(), AbstractC5669j.class) || !AbstractC1638q.m6564D(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
