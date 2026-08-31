package androidx.coordinatorlayout.widget;

import androidx.collection.C2400k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p104N.C0908e;
import p104N.InterfaceC0907d;

/* JADX INFO: renamed from: androidx.coordinatorlayout.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2430a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0907d f9275a = new C0908e(10);

    /* JADX INFO: renamed from: b */
    private final C2400k f9276b = new C2400k();

    /* JADX INFO: renamed from: c */
    private final ArrayList f9277c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final HashSet f9278d = new HashSet();

    /* JADX INFO: renamed from: e */
    private void m10546e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f9276b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                m10546e(arrayList2.get(i7), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: f */
    private ArrayList m10547f() {
        ArrayList arrayList = (ArrayList) this.f9275a.mo4131b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    /* JADX INFO: renamed from: l */
    private void m10548l(ArrayList arrayList) {
        arrayList.clear();
        this.f9275a.mo4130a(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public void m10549a(Object obj, Object obj2) {
        if (!this.f9276b.containsKey(obj) || !this.f9276b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListM10547f = (ArrayList) this.f9276b.get(obj);
        if (arrayListM10547f == null) {
            arrayListM10547f = m10547f();
            this.f9276b.put(obj, arrayListM10547f);
        }
        arrayListM10547f.add(obj2);
    }

    /* JADX INFO: renamed from: b */
    public void m10550b(Object obj) {
        if (this.f9276b.containsKey(obj)) {
            return;
        }
        this.f9276b.put(obj, null);
    }

    /* JADX INFO: renamed from: c */
    public void m10551c() {
        int size = this.f9276b.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList = (ArrayList) this.f9276b.m10301k(i7);
            if (arrayList != null) {
                m10548l(arrayList);
            }
        }
        this.f9276b.clear();
    }

    /* JADX INFO: renamed from: d */
    public boolean m10552d(Object obj) {
        return this.f9276b.containsKey(obj);
    }

    /* JADX INFO: renamed from: g */
    public List m10553g(Object obj) {
        ArrayList arrayListM10554h = m10554h(obj);
        if (arrayListM10554h == null) {
            return null;
        }
        return new ArrayList(arrayListM10554h);
    }

    /* JADX INFO: renamed from: h */
    ArrayList m10554h(Object obj) {
        return (ArrayList) this.f9276b.get(obj);
    }

    /* JADX INFO: renamed from: i */
    public List m10555i(Object obj) {
        int size = this.f9276b.size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList2 = (ArrayList) this.f9276b.m10301k(i7);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f9276b.m10300f(i7));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public ArrayList m10556j() {
        this.f9277c.clear();
        this.f9278d.clear();
        int size = this.f9276b.size();
        for (int i7 = 0; i7 < size; i7++) {
            m10546e(this.f9276b.m10300f(i7), this.f9277c, this.f9278d);
        }
        return this.f9277c;
    }

    /* JADX INFO: renamed from: k */
    public boolean m10557k(Object obj) {
        int size = this.f9276b.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList = (ArrayList) this.f9276b.m10301k(i7);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
