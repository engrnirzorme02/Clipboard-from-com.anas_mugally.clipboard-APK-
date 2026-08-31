package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: kotlin.jvm.internal.E */
/* JADX INFO: loaded from: classes.dex */
public class C6102E {

    /* JADX INFO: renamed from: a */
    private final ArrayList f23862a;

    public C6102E(int i7) {
        this.f23862a = new ArrayList(i7);
    }

    /* JADX INFO: renamed from: a */
    public void m27154a(Object obj) {
        this.f23862a.add(obj);
    }

    /* JADX INFO: renamed from: b */
    public void m27155b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f23862a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f23862a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f23862a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f23862a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f23862a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    /* JADX INFO: renamed from: c */
    public int m27156c() {
        return this.f23862a.size();
    }

    /* JADX INFO: renamed from: d */
    public Object[] m27157d(Object[] objArr) {
        return this.f23862a.toArray(objArr);
    }
}
