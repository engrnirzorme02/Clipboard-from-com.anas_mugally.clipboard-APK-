package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.w */
/* JADX INFO: loaded from: classes.dex */
class C2605w {

    /* JADX INFO: renamed from: a */
    private final ArrayList f10336a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final HashMap f10337b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final HashMap f10338c = new HashMap();

    /* JADX INFO: renamed from: d */
    private C2602t f10339d;

    C2605w() {
    }

    /* JADX INFO: renamed from: A */
    void m12477A(C2602t c2602t) {
        this.f10339d = c2602t;
    }

    /* JADX INFO: renamed from: B */
    Bundle m12478B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f10338c.put(str, bundle) : (Bundle) this.f10338c.remove(str);
    }

    /* JADX INFO: renamed from: a */
    void m12479a(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (this.f10336a.contains(abstractComponentCallbacksC2591i)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC2591i);
        }
        synchronized (this.f10336a) {
            this.f10336a.add(abstractComponentCallbacksC2591i);
        }
        abstractComponentCallbacksC2591i.f10169w = true;
    }

    /* JADX INFO: renamed from: b */
    void m12480b() {
        this.f10337b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: renamed from: c */
    boolean m12481c(String str) {
        return this.f10337b.get(str) != null;
    }

    /* JADX INFO: renamed from: d */
    void m12482d(int i7) {
        for (C2604v c2604v : this.f10337b.values()) {
            if (c2604v != null) {
                c2604v.m12474t(i7);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    void m12483e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f10337b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C2604v c2604v : this.f10337b.values()) {
                printWriter.print(str);
                if (c2604v != null) {
                    AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = c2604v.m12466k();
                    printWriter.println(abstractComponentCallbacksC2591iM12466k);
                    abstractComponentCallbacksC2591iM12466k.mo12173i(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f10336a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size; i7++) {
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) this.f10336a.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC2591i.toString());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    AbstractComponentCallbacksC2591i m12484f(String str) {
        C2604v c2604v = (C2604v) this.f10337b.get(str);
        if (c2604v != null) {
            return c2604v.m12466k();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    AbstractComponentCallbacksC2591i m12485g(int i7) {
        for (int size = this.f10336a.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) this.f10336a.get(size);
            if (abstractComponentCallbacksC2591i != null && abstractComponentCallbacksC2591i.f10127I == i7) {
                return abstractComponentCallbacksC2591i;
            }
        }
        for (C2604v c2604v : this.f10337b.values()) {
            if (c2604v != null) {
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = c2604v.m12466k();
                if (abstractComponentCallbacksC2591iM12466k.f10127I == i7) {
                    return abstractComponentCallbacksC2591iM12466k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    AbstractComponentCallbacksC2591i m12486h(String str) {
        if (str != null) {
            for (int size = this.f10336a.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) this.f10336a.get(size);
                if (abstractComponentCallbacksC2591i != null && str.equals(abstractComponentCallbacksC2591i.f10129K)) {
                    return abstractComponentCallbacksC2591i;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C2604v c2604v : this.f10337b.values()) {
            if (c2604v != null) {
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = c2604v.m12466k();
                if (str.equals(abstractComponentCallbacksC2591iM12466k.f10129K)) {
                    return abstractComponentCallbacksC2591iM12466k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    AbstractComponentCallbacksC2591i m12487i(String str) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12178k;
        for (C2604v c2604v : this.f10337b.values()) {
            if (c2604v != null && (abstractComponentCallbacksC2591iM12178k = c2604v.m12466k().m12178k(str)) != null) {
                return abstractComponentCallbacksC2591iM12178k;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    int m12488j(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        View view;
        View view2;
        ViewGroup viewGroup = abstractComponentCallbacksC2591i.f10137S;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f10336a.indexOf(abstractComponentCallbacksC2591i);
        for (int i7 = iIndexOf - 1; i7 >= 0; i7--) {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = (AbstractComponentCallbacksC2591i) this.f10336a.get(i7);
            if (abstractComponentCallbacksC2591i2.f10137S == viewGroup && (view2 = abstractComponentCallbacksC2591i2.f10138T) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f10336a.size()) {
                return -1;
            }
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i3 = (AbstractComponentCallbacksC2591i) this.f10336a.get(iIndexOf);
            if (abstractComponentCallbacksC2591i3.f10137S == viewGroup && (view = abstractComponentCallbacksC2591i3.f10138T) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    List m12489k() {
        ArrayList arrayList = new ArrayList();
        for (C2604v c2604v : this.f10337b.values()) {
            if (c2604v != null) {
                arrayList.add(c2604v);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    List m12490l() {
        ArrayList arrayList = new ArrayList();
        for (C2604v c2604v : this.f10337b.values()) {
            if (c2604v != null) {
                arrayList.add(c2604v.m12466k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    HashMap m12491m() {
        return this.f10338c;
    }

    /* JADX INFO: renamed from: n */
    C2604v m12492n(String str) {
        return (C2604v) this.f10337b.get(str);
    }

    /* JADX INFO: renamed from: o */
    List m12493o() {
        ArrayList arrayList;
        if (this.f10336a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f10336a) {
            arrayList = new ArrayList(this.f10336a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    C2602t m12494p() {
        return this.f10339d;
    }

    /* JADX INFO: renamed from: q */
    Bundle m12495q(String str) {
        return (Bundle) this.f10338c.get(str);
    }

    /* JADX INFO: renamed from: r */
    void m12496r(C2604v c2604v) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = c2604v.m12466k();
        if (m12481c(abstractComponentCallbacksC2591iM12466k.f10155f)) {
            return;
        }
        this.f10337b.put(abstractComponentCallbacksC2591iM12466k.f10155f, c2604v);
        if (abstractComponentCallbacksC2591iM12466k.f10133O) {
            if (abstractComponentCallbacksC2591iM12466k.f10132N) {
                this.f10339d.m12440e(abstractComponentCallbacksC2591iM12466k);
            } else {
                this.f10339d.m12448o(abstractComponentCallbacksC2591iM12466k);
            }
            abstractComponentCallbacksC2591iM12466k.f10133O = false;
        }
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC2591iM12466k);
        }
    }

    /* JADX INFO: renamed from: s */
    void m12497s(C2604v c2604v) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = c2604v.m12466k();
        if (abstractComponentCallbacksC2591iM12466k.f10132N) {
            this.f10339d.m12448o(abstractComponentCallbacksC2591iM12466k);
        }
        if (this.f10337b.get(abstractComponentCallbacksC2591iM12466k.f10155f) == c2604v && ((C2604v) this.f10337b.put(abstractComponentCallbacksC2591iM12466k.f10155f, null)) != null && AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC2591iM12466k);
        }
    }

    /* JADX INFO: renamed from: t */
    void m12498t() {
        Iterator it = this.f10336a.iterator();
        while (it.hasNext()) {
            C2604v c2604v = (C2604v) this.f10337b.get(((AbstractComponentCallbacksC2591i) it.next()).f10155f);
            if (c2604v != null) {
                c2604v.m12467m();
            }
        }
        for (C2604v c2604v2 : this.f10337b.values()) {
            if (c2604v2 != null) {
                c2604v2.m12467m();
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = c2604v2.m12466k();
                if (abstractComponentCallbacksC2591iM12466k.f10170x && !abstractComponentCallbacksC2591iM12466k.m12174i0()) {
                    if (abstractComponentCallbacksC2591iM12466k.f10171y && !this.f10338c.containsKey(abstractComponentCallbacksC2591iM12466k.f10155f)) {
                        m12478B(abstractComponentCallbacksC2591iM12466k.f10155f, c2604v2.m12472r());
                    }
                    m12497s(c2604v2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    void m12499u(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        synchronized (this.f10336a) {
            this.f10336a.remove(abstractComponentCallbacksC2591i);
        }
        abstractComponentCallbacksC2591i.f10169w = false;
    }

    /* JADX INFO: renamed from: v */
    void m12500v() {
        this.f10337b.clear();
    }

    /* JADX INFO: renamed from: w */
    void m12501w(List list) {
        this.f10336a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12484f = m12484f(str);
                if (abstractComponentCallbacksC2591iM12484f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (AbstractC2599q.m12289I0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + abstractComponentCallbacksC2591iM12484f);
                }
                m12479a(abstractComponentCallbacksC2591iM12484f);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    void m12502x(HashMap map) {
        this.f10338c.clear();
        this.f10338c.putAll(map);
    }

    /* JADX INFO: renamed from: y */
    ArrayList m12503y() {
        ArrayList arrayList = new ArrayList(this.f10337b.size());
        for (C2604v c2604v : this.f10337b.values()) {
            if (c2604v != null) {
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = c2604v.m12466k();
                m12478B(abstractComponentCallbacksC2591iM12466k.f10155f, c2604v.m12472r());
                arrayList.add(abstractComponentCallbacksC2591iM12466k.f10155f);
                if (AbstractC2599q.m12289I0(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC2591iM12466k + ": " + abstractComponentCallbacksC2591iM12466k.f10147b);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    ArrayList m12504z() {
        synchronized (this.f10336a) {
            try {
                if (this.f10336a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f10336a.size());
                for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : this.f10336a) {
                    arrayList.add(abstractComponentCallbacksC2591i.f10155f);
                    if (AbstractC2599q.m12289I0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC2591i.f10155f + "): " + abstractComponentCallbacksC2591i);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
