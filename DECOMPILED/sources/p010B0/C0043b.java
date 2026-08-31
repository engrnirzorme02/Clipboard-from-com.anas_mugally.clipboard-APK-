package p010B0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.InterfaceC2654p;
import androidx.lifecycle.InterfaceC2657s;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p081K.AbstractC0712d;
import p145S5.AbstractC1440r;
import p145S5.C1435m;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1638q;

/* JADX INFO: renamed from: B0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0043b implements InterfaceC2654p {

    /* JADX INFO: renamed from: b */
    public static final a f378b = new a(null);

    /* JADX INFO: renamed from: a */
    private final InterfaceC0050i f379a;

    /* JADX INFO: renamed from: B0.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: B0.b$b */
    public static final class b implements C0047f.b {

        /* JADX INFO: renamed from: a */
        private final Set f380a;

        public b(C0047f registry) {
            AbstractC6118n.m27187e(registry, "registry");
            this.f380a = new LinkedHashSet();
            registry.m187c("androidx.savedstate.Restarter", this);
        }

        @Override // p010B0.C0047f.b
        /* JADX INFO: renamed from: a */
        public Bundle mo174a() {
            C1435m[] c1435mArr;
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
            AbstractC0051j.m202d(AbstractC0051j.m199a(bundleM3458a), "classes_to_restore", AbstractC1638q.m6593g0(this.f380a));
            return bundleM3458a;
        }

        /* JADX INFO: renamed from: b */
        public final void m175b(String className) {
            AbstractC6118n.m27187e(className, "className");
            this.f380a.add(className);
        }
    }

    public C0043b(InterfaceC0050i owner) {
        AbstractC6118n.m27187e(owner, "owner");
        this.f379a = owner;
    }

    /* JADX INFO: renamed from: a */
    private final void m172a(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, C0043b.class.getClassLoader()).asSubclass(C0047f.a.class);
            AbstractC6118n.m27184b(clsAsSubclass);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                    AbstractC6118n.m27184b(objNewInstance);
                    ((C0047f.a) objNewInstance).mo189a(this.f379a);
                } catch (Exception e7) {
                    throw new RuntimeException("Failed to instantiate " + str, e7);
                }
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
            }
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("Class " + str + " wasn't found", e9);
        }
    }

    @Override // androidx.lifecycle.InterfaceC2654p
    /* JADX INFO: renamed from: n */
    public void mo173n(InterfaceC2657s source, AbstractC2650l.a event) {
        AbstractC6118n.m27187e(source, "source");
        AbstractC6118n.m27187e(event, "event");
        if (event != AbstractC2650l.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.mo419P().mo12628d(this);
        Bundle bundleM185a = this.f379a.mo198A().m185a("androidx.savedstate.Restarter");
        if (bundleM185a == null) {
            return;
        }
        List listM180e = AbstractC0044c.m180e(AbstractC0044c.m176a(bundleM185a), "classes_to_restore");
        if (listM180e == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator it = listM180e.iterator();
        while (it.hasNext()) {
            m172a((String) it.next());
        }
    }
}
