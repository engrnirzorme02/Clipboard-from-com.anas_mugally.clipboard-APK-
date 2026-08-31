package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends AbstractC2471d {

    /* JADX INFO: renamed from: a */
    private Set f9395a = new HashSet();

    /* JADX INFO: renamed from: b */
    private List f9396b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    private List f9397c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    private boolean m10816f() {
        boolean z7 = false;
        for (String str : this.f9397c) {
            try {
                Class<?> cls = Class.forName(str);
                if (AbstractC2471d.class.isAssignableFrom(cls)) {
                    m10820e((AbstractC2471d) cls.newInstance());
                    this.f9397c.remove(str);
                    z7 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e7) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e7);
            } catch (InstantiationException e8) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e8);
            }
        }
        return z7;
    }

    @Override // androidx.databinding.AbstractC2471d
    /* JADX INFO: renamed from: b */
    public AbstractC2474g mo10817b(InterfaceC2472e interfaceC2472e, View view, int i7) {
        Iterator it = this.f9396b.iterator();
        while (it.hasNext()) {
            AbstractC2474g abstractC2474gMo10817b = ((AbstractC2471d) it.next()).mo10817b(interfaceC2472e, view, i7);
            if (abstractC2474gMo10817b != null) {
                return abstractC2474gMo10817b;
            }
        }
        if (m10816f()) {
            return mo10817b(interfaceC2472e, view, i7);
        }
        return null;
    }

    @Override // androidx.databinding.AbstractC2471d
    /* JADX INFO: renamed from: c */
    public AbstractC2474g mo10818c(InterfaceC2472e interfaceC2472e, View[] viewArr, int i7) {
        Iterator it = this.f9396b.iterator();
        while (it.hasNext()) {
            AbstractC2474g abstractC2474gMo10818c = ((AbstractC2471d) it.next()).mo10818c(interfaceC2472e, viewArr, i7);
            if (abstractC2474gMo10818c != null) {
                return abstractC2474gMo10818c;
            }
        }
        if (m10816f()) {
            return mo10818c(interfaceC2472e, viewArr, i7);
        }
        return null;
    }

    @Override // androidx.databinding.AbstractC2471d
    /* JADX INFO: renamed from: d */
    public int mo10819d(String str) {
        Iterator it = this.f9396b.iterator();
        while (it.hasNext()) {
            int iMo10819d = ((AbstractC2471d) it.next()).mo10819d(str);
            if (iMo10819d != 0) {
                return iMo10819d;
            }
        }
        if (m10816f()) {
            return mo10819d(str);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public void m10820e(AbstractC2471d abstractC2471d) {
        if (this.f9395a.add(abstractC2471d.getClass())) {
            this.f9396b.add(abstractC2471d);
            Iterator it = abstractC2471d.mo10821a().iterator();
            while (it.hasNext()) {
                m10820e((AbstractC2471d) it.next());
            }
        }
    }
}
