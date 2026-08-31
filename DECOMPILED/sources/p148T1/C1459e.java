package p148T1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p019C1.InterfaceC0134j;

/* JADX INFO: renamed from: T1.e */
/* JADX INFO: loaded from: classes.dex */
public class C1459e {

    /* JADX INFO: renamed from: a */
    private final List f4991a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final Map f4992b = new HashMap();

    /* JADX INFO: renamed from: T1.e$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private final Class f4993a;

        /* JADX INFO: renamed from: b */
        final Class f4994b;

        /* JADX INFO: renamed from: c */
        final InterfaceC0134j f4995c;

        public a(Class cls, Class cls2, InterfaceC0134j interfaceC0134j) {
            this.f4993a = cls;
            this.f4994b = cls2;
            this.f4995c = interfaceC0134j;
        }

        /* JADX INFO: renamed from: a */
        public boolean m6119a(Class cls, Class cls2) {
            return this.f4993a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f4994b);
        }
    }

    /* JADX INFO: renamed from: c */
    private synchronized List m6114c(String str) {
        List arrayList;
        try {
            if (!this.f4991a.contains(str)) {
                this.f4991a.add(str);
            }
            arrayList = (List) this.f4992b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f4992b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m6115a(String str, InterfaceC0134j interfaceC0134j, Class cls, Class cls2) {
        m6114c(str).add(new a(cls, cls2, interfaceC0134j));
    }

    /* JADX INFO: renamed from: b */
    public synchronized List m6116b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f4991a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f4992b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m6119a(cls, cls2)) {
                        arrayList.add(aVar.f4995c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public synchronized List m6117d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f4991a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f4992b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.m6119a(cls, cls2) && !arrayList.contains(aVar.f4994b)) {
                        arrayList.add(aVar.f4994b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m6118e(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f4991a);
            this.f4991a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f4991a.add((String) it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f4991a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
