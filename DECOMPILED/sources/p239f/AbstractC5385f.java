package p239f;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.InterfaceC2654p;
import androidx.lifecycle.InterfaceC2657s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6104G;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p017C.AbstractC0102c;
import p081K.AbstractC0711c;
import p238e6.InterfaceC5356a;
import p247g.AbstractC5447a;
import p262h6.AbstractC5657c;
import p294l6.AbstractC6307h;

/* JADX INFO: renamed from: f.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5385f {

    /* JADX INFO: renamed from: h */
    private static final b f20499h = new b(null);

    /* JADX INFO: renamed from: a */
    private final Map f20500a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    private final Map f20501b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    private final Map f20502c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    private final List f20503d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final transient Map f20504e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    private final Map f20505f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    private final Bundle f20506g = new Bundle();

    /* JADX INFO: renamed from: f.f$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final InterfaceC5381b f20507a;

        /* JADX INFO: renamed from: b */
        private final AbstractC5447a f20508b;

        public a(InterfaceC5381b callback, AbstractC5447a contract) {
            AbstractC6118n.m27187e(callback, "callback");
            AbstractC6118n.m27187e(contract, "contract");
            this.f20507a = callback;
            this.f20508b = contract;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC5381b m24412a() {
            return this.f20507a;
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC5447a m24413b() {
            return this.f20508b;
        }
    }

    /* JADX INFO: renamed from: f.f$b */
    private static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: f.f$c */
    private static final class c {

        /* JADX INFO: renamed from: a */
        private final AbstractC2650l f20509a;

        /* JADX INFO: renamed from: b */
        private final List f20510b;

        public c(AbstractC2650l lifecycle) {
            AbstractC6118n.m27187e(lifecycle, "lifecycle");
            this.f20509a = lifecycle;
            this.f20510b = new ArrayList();
        }

        /* JADX INFO: renamed from: a */
        public final void m24414a(InterfaceC2654p observer) {
            AbstractC6118n.m27187e(observer, "observer");
            this.f20509a.mo12625a(observer);
            this.f20510b.add(observer);
        }

        /* JADX INFO: renamed from: b */
        public final void m24415b() {
            Iterator it = this.f20510b.iterator();
            while (it.hasNext()) {
                this.f20509a.mo12628d((InterfaceC2654p) it.next());
            }
            this.f20510b.clear();
        }
    }

    /* JADX INFO: renamed from: f.f$d */
    public static final class d extends AbstractC5382c {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f20512b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC5447a f20513c;

        d(String str, AbstractC5447a abstractC5447a) {
            this.f20512b = str;
            this.f20513c = abstractC5447a;
        }

        @Override // p239f.AbstractC5382c
        /* JADX INFO: renamed from: b */
        public void mo12217b(Object obj, AbstractC0102c abstractC0102c) throws Exception {
            Object obj2 = AbstractC5385f.this.f20501b.get(this.f20512b);
            AbstractC5447a abstractC5447a = this.f20513c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                AbstractC5385f.this.f20503d.add(this.f20512b);
                try {
                    AbstractC5385f.this.mo24008k(iIntValue, this.f20513c, obj, abstractC0102c);
                    return;
                } catch (Exception e7) {
                    AbstractC5385f.this.f20503d.remove(this.f20512b);
                    throw e7;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC5447a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p239f.AbstractC5382c
        /* JADX INFO: renamed from: c */
        public void mo12218c() {
            AbstractC5385f.this.m24411r(this.f20512b);
        }
    }

    /* JADX INFO: renamed from: f.f$e */
    public static final class e extends AbstractC5382c {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f20515b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC5447a f20516c;

        e(String str, AbstractC5447a abstractC5447a) {
            this.f20515b = str;
            this.f20516c = abstractC5447a;
        }

        @Override // p239f.AbstractC5382c
        /* JADX INFO: renamed from: b */
        public void mo12217b(Object obj, AbstractC0102c abstractC0102c) throws Exception {
            Object obj2 = AbstractC5385f.this.f20501b.get(this.f20515b);
            AbstractC5447a abstractC5447a = this.f20516c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                AbstractC5385f.this.f20503d.add(this.f20515b);
                try {
                    AbstractC5385f.this.mo24008k(iIntValue, this.f20516c, obj, abstractC0102c);
                    return;
                } catch (Exception e7) {
                    AbstractC5385f.this.f20503d.remove(this.f20515b);
                    throw e7;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC5447a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p239f.AbstractC5382c
        /* JADX INFO: renamed from: c */
        public void mo12218c() {
            AbstractC5385f.this.m24411r(this.f20515b);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m24399e(int i7, String str) {
        this.f20500a.put(Integer.valueOf(i7), str);
        this.f20501b.put(str, Integer.valueOf(i7));
    }

    /* JADX INFO: renamed from: h */
    private final void m24400h(String str, int i7, Intent intent, a aVar) {
        if ((aVar != null ? aVar.m24412a() : null) == null || !this.f20503d.contains(str)) {
            this.f20505f.remove(str);
            this.f20506g.putParcelable(str, new C5380a(i7, intent));
        } else {
            aVar.m24412a().mo12412a(aVar.m24413b().mo12417c(i7, intent));
            this.f20503d.remove(str);
        }
    }

    /* JADX INFO: renamed from: i */
    private final int m24401i() {
        for (Number number : AbstractC6307h.m27241f(new InterfaceC5356a() { // from class: f.e
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AbstractC5385f.m24402j();
            }
        })) {
            if (!this.f20500a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Integer m24402j() {
        return Integer.valueOf(AbstractC5657c.f21645a.mo25165e(2147418112) + 65536);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m24403p(AbstractC5385f abstractC5385f, String str, InterfaceC5381b interfaceC5381b, AbstractC5447a abstractC5447a, InterfaceC2657s interfaceC2657s, AbstractC2650l.a event) {
        AbstractC6118n.m27187e(interfaceC2657s, "<unused var>");
        AbstractC6118n.m27187e(event, "event");
        if (AbstractC2650l.a.ON_START != event) {
            if (AbstractC2650l.a.ON_STOP == event) {
                abstractC5385f.f20504e.remove(str);
                return;
            } else {
                if (AbstractC2650l.a.ON_DESTROY == event) {
                    abstractC5385f.m24411r(str);
                    return;
                }
                return;
            }
        }
        abstractC5385f.f20504e.put(str, new a(interfaceC5381b, abstractC5447a));
        if (abstractC5385f.f20505f.containsKey(str)) {
            Object obj = abstractC5385f.f20505f.get(str);
            abstractC5385f.f20505f.remove(str);
            interfaceC5381b.mo12412a(obj);
        }
        C5380a c5380a = (C5380a) AbstractC0711c.m3456a(abstractC5385f.f20506g, str, C5380a.class);
        if (c5380a != null) {
            abstractC5385f.f20506g.remove(str);
            interfaceC5381b.mo12412a(abstractC5447a.mo12417c(c5380a.m24390b(), c5380a.m24389a()));
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m24404q(String str) {
        if (((Integer) this.f20501b.get(str)) != null) {
            return;
        }
        m24399e(m24401i(), str);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m24405f(int i7, int i8, Intent intent) {
        String str = (String) this.f20500a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        m24400h(str, i8, intent, (a) this.f20504e.get(str));
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m24406g(int i7, Object obj) {
        String str = (String) this.f20500a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f20504e.get(str);
        if ((aVar != null ? aVar.m24412a() : null) == null) {
            this.f20506g.remove(str);
            this.f20505f.put(str, obj);
            return true;
        }
        InterfaceC5381b interfaceC5381bM24412a = aVar.m24412a();
        AbstractC6118n.m27185c(interfaceC5381bM24412a, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f20503d.remove(str)) {
            return true;
        }
        interfaceC5381bM24412a.mo12412a(obj);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo24008k(int i7, AbstractC5447a abstractC5447a, Object obj, AbstractC0102c abstractC0102c);

    /* JADX INFO: renamed from: l */
    public final void m24407l(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f20503d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f20506g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            String str = stringArrayList.get(i7);
            if (this.f20501b.containsKey(str)) {
                Integer num = (Integer) this.f20501b.remove(str);
                if (!this.f20506g.containsKey(str)) {
                    AbstractC6104G.m27160c(this.f20500a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i7);
            AbstractC6118n.m27186d(num2, "get(...)");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i7);
            AbstractC6118n.m27186d(str2, "get(...)");
            m24399e(iIntValue, str2);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m24408m(Bundle outState) {
        AbstractC6118n.m27187e(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f20501b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f20501b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f20503d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f20506g));
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC5382c m24409n(final String key, InterfaceC2657s lifecycleOwner, final AbstractC5447a contract, final InterfaceC5381b callback) {
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(lifecycleOwner, "lifecycleOwner");
        AbstractC6118n.m27187e(contract, "contract");
        AbstractC6118n.m27187e(callback, "callback");
        AbstractC2650l abstractC2650lMo419P = lifecycleOwner.mo419P();
        if (abstractC2650lMo419P.mo12626b().m12634d(AbstractC2650l.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + abstractC2650lMo419P.mo12626b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        m24404q(key);
        c cVar = (c) this.f20502c.get(key);
        if (cVar == null) {
            cVar = new c(abstractC2650lMo419P);
        }
        cVar.m24414a(new InterfaceC2654p() { // from class: f.d
            @Override // androidx.lifecycle.InterfaceC2654p
            /* JADX INFO: renamed from: n */
            public final void mo173n(InterfaceC2657s interfaceC2657s, AbstractC2650l.a aVar) {
                AbstractC5385f.m24403p(this.f20495a, key, callback, contract, interfaceC2657s, aVar);
            }
        });
        this.f20502c.put(key, cVar);
        return new d(key, contract);
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC5382c m24410o(String key, AbstractC5447a contract, InterfaceC5381b callback) {
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(contract, "contract");
        AbstractC6118n.m27187e(callback, "callback");
        m24404q(key);
        this.f20504e.put(key, new a(callback, contract));
        if (this.f20505f.containsKey(key)) {
            Object obj = this.f20505f.get(key);
            this.f20505f.remove(key);
            callback.mo12412a(obj);
        }
        C5380a c5380a = (C5380a) AbstractC0711c.m3456a(this.f20506g, key, C5380a.class);
        if (c5380a != null) {
            this.f20506g.remove(key);
            callback.mo12412a(contract.mo12417c(c5380a.m24390b(), c5380a.m24389a()));
        }
        return new e(key, contract);
    }

    /* JADX INFO: renamed from: r */
    public final void m24411r(String key) {
        Integer num;
        AbstractC6118n.m27187e(key, "key");
        if (!this.f20503d.contains(key) && (num = (Integer) this.f20501b.remove(key)) != null) {
            this.f20500a.remove(num);
        }
        this.f20504e.remove(key);
        if (this.f20505f.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f20505f.get(key));
            this.f20505f.remove(key);
        }
        if (this.f20506g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C5380a) AbstractC0711c.m3456a(this.f20506g, key, C5380a.class)));
            this.f20506g.remove(key);
        }
        c cVar = (c) this.f20502c.get(key);
        if (cVar != null) {
            cVar.m24415b();
            this.f20502c.remove(key);
        }
    }
}
