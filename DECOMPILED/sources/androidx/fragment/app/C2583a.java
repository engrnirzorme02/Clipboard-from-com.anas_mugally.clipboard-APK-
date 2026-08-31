package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC2650l;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
final class C2583a extends AbstractC2606x implements AbstractC2599q.m {

    /* JADX INFO: renamed from: t */
    final AbstractC2599q f10049t;

    /* JADX INFO: renamed from: u */
    boolean f10050u;

    /* JADX INFO: renamed from: v */
    int f10051v;

    /* JADX INFO: renamed from: w */
    boolean f10052w;

    C2583a(AbstractC2599q abstractC2599q) {
        super(abstractC2599q.m12399t0(), abstractC2599q.m12403v0() != null ? abstractC2599q.m12403v0().m12269j().getClassLoader() : null);
        this.f10051v = -1;
        this.f10052w = false;
        this.f10049t = abstractC2599q;
    }

    /* JADX INFO: renamed from: A */
    public String m12012A() {
        return this.f10350k;
    }

    /* JADX INFO: renamed from: B */
    public void m12013B() {
        if (this.f10358s != null) {
            for (int i7 = 0; i7 < this.f10358s.size(); i7++) {
                ((Runnable) this.f10358s.get(i7)).run();
            }
            this.f10358s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX INFO: renamed from: C */
    AbstractComponentCallbacksC2591i m12014C(ArrayList arrayList, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        for (int size = this.f10342c.size() - 1; size >= 0; size--) {
            AbstractC2606x.a aVar = (AbstractC2606x.a) this.f10342c.get(size);
            int i7 = aVar.f10359a;
            if (i7 == 1) {
                arrayList.remove(aVar.f10360b);
            } else if (i7 != 3) {
                switch (i7) {
                    case 6:
                        arrayList.add(aVar.f10360b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f10360b);
                        break;
                    case 8:
                        abstractComponentCallbacksC2591i = null;
                        break;
                    case 9:
                        abstractComponentCallbacksC2591i = aVar.f10360b;
                        break;
                    case 10:
                        aVar.f10367i = aVar.f10366h;
                        break;
                }
            } else {
                arrayList.add(aVar.f10360b);
            }
        }
        return abstractComponentCallbacksC2591i;
    }

    @Override // androidx.fragment.app.AbstractC2599q.m
    /* JADX INFO: renamed from: a */
    public boolean mo12015a(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f10348i) {
            return true;
        }
        this.f10049t.m12375g(this);
        return true;
    }

    @Override // androidx.fragment.app.AbstractC2606x
    /* JADX INFO: renamed from: g */
    public int mo12016g() {
        return m12026u(false);
    }

    @Override // androidx.fragment.app.AbstractC2606x
    /* JADX INFO: renamed from: h */
    public int mo12017h() {
        return m12026u(true);
    }

    @Override // androidx.fragment.app.AbstractC2606x
    /* JADX INFO: renamed from: i */
    public void mo12018i() {
        m12510l();
        this.f10049t.m12368a0(this, false);
    }

    @Override // androidx.fragment.app.AbstractC2606x
    /* JADX INFO: renamed from: j */
    public void mo12019j() {
        m12510l();
        this.f10049t.m12368a0(this, true);
    }

    @Override // androidx.fragment.app.AbstractC2606x
    /* JADX INFO: renamed from: k */
    public AbstractC2606x mo12020k(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        AbstractC2599q abstractC2599q = abstractComponentCallbacksC2591i.f10123E;
        if (abstractC2599q == null || abstractC2599q == this.f10049t) {
            return super.mo12020k(abstractComponentCallbacksC2591i);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC2591i.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC2606x
    /* JADX INFO: renamed from: m */
    void mo12021m(int i7, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, String str, int i8) {
        super.mo12021m(i7, abstractComponentCallbacksC2591i, str, i8);
        abstractComponentCallbacksC2591i.f10123E = this.f10049t;
    }

    @Override // androidx.fragment.app.AbstractC2606x
    /* JADX INFO: renamed from: n */
    public boolean mo12022n() {
        return this.f10342c.isEmpty();
    }

    @Override // androidx.fragment.app.AbstractC2606x
    /* JADX INFO: renamed from: o */
    public AbstractC2606x mo12023o(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        AbstractC2599q abstractC2599q = abstractComponentCallbacksC2591i.f10123E;
        if (abstractC2599q == null || abstractC2599q == this.f10049t) {
            return super.mo12023o(abstractComponentCallbacksC2591i);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC2591i.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC2606x
    /* JADX INFO: renamed from: r */
    public AbstractC2606x mo12024r(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, AbstractC2650l.b bVar) {
        if (abstractComponentCallbacksC2591i.f10123E != this.f10049t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f10049t);
        }
        if (bVar == AbstractC2650l.b.INITIALIZED && abstractComponentCallbacksC2591i.f10145a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != AbstractC2650l.b.DESTROYED) {
            return super.mo12024r(abstractComponentCallbacksC2591i, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    /* JADX INFO: renamed from: t */
    void m12025t(int i7) {
        if (this.f10348i) {
            if (AbstractC2599q.m12289I0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i7);
            }
            int size = this.f10342c.size();
            for (int i8 = 0; i8 < size; i8++) {
                AbstractC2606x.a aVar = (AbstractC2606x.a) this.f10342c.get(i8);
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = aVar.f10360b;
                if (abstractComponentCallbacksC2591i != null) {
                    abstractComponentCallbacksC2591i.f10122D += i7;
                    if (AbstractC2599q.m12289I0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f10360b + " to " + aVar.f10360b.f10122D);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f10051v >= 0) {
            sb.append(" #");
            sb.append(this.f10051v);
        }
        if (this.f10350k != null) {
            sb.append(" ");
            sb.append(this.f10350k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    int m12026u(boolean z7) {
        if (this.f10050u) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC2599q.m12289I0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C2576C("FragmentManager"));
            m12027v("  ", printWriter);
            printWriter.close();
        }
        this.f10050u = true;
        if (this.f10348i) {
            this.f10051v = this.f10049t.m12385k();
        } else {
            this.f10051v = -1;
        }
        this.f10049t.m12364X(this, z7);
        return this.f10051v;
    }

    /* JADX INFO: renamed from: v */
    public void m12027v(String str, PrintWriter printWriter) {
        m12028w(str, printWriter, true);
    }

    /* JADX INFO: renamed from: w */
    public void m12028w(String str, PrintWriter printWriter, boolean z7) {
        String str2;
        if (z7) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f10350k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f10051v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f10050u);
            if (this.f10347h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f10347h));
            }
            if (this.f10343d != 0 || this.f10344e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f10343d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f10344e));
            }
            if (this.f10345f != 0 || this.f10346g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f10345f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f10346g));
            }
            if (this.f10351l != 0 || this.f10352m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f10351l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f10352m);
            }
            if (this.f10353n != 0 || this.f10354o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f10353n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f10354o);
            }
        }
        if (this.f10342c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f10342c.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2606x.a aVar = (AbstractC2606x.a) this.f10342c.get(i7);
            switch (aVar.f10359a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f10359a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f10360b);
            if (z7) {
                if (aVar.f10362d != 0 || aVar.f10363e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f10362d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f10363e));
                }
                if (aVar.f10364f != 0 || aVar.f10365g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f10364f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f10365g));
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    void m12029x() {
        int size = this.f10342c.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2606x.a aVar = (AbstractC2606x.a) this.f10342c.get(i7);
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = aVar.f10360b;
            if (abstractComponentCallbacksC2591i != null) {
                abstractComponentCallbacksC2591i.f10171y = this.f10052w;
                abstractComponentCallbacksC2591i.m12131J1(false);
                abstractComponentCallbacksC2591i.m12128I1(this.f10347h);
                abstractComponentCallbacksC2591i.m12139M1(this.f10355p, this.f10356q);
            }
            switch (aVar.f10359a) {
                case 1:
                    abstractComponentCallbacksC2591i.m12115D1(aVar.f10362d, aVar.f10363e, aVar.f10364f, aVar.f10365g);
                    this.f10049t.m12388l1(abstractComponentCallbacksC2591i, false);
                    this.f10049t.m12378h(abstractComponentCallbacksC2591i);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f10359a);
                case 3:
                    abstractComponentCallbacksC2591i.m12115D1(aVar.f10362d, aVar.f10363e, aVar.f10364f, aVar.f10365g);
                    this.f10049t.m12371c1(abstractComponentCallbacksC2591i);
                    break;
                case 4:
                    abstractComponentCallbacksC2591i.m12115D1(aVar.f10362d, aVar.f10363e, aVar.f10364f, aVar.f10365g);
                    this.f10049t.m12336F0(abstractComponentCallbacksC2591i);
                    break;
                case 5:
                    abstractComponentCallbacksC2591i.m12115D1(aVar.f10362d, aVar.f10363e, aVar.f10364f, aVar.f10365g);
                    this.f10049t.m12388l1(abstractComponentCallbacksC2591i, false);
                    this.f10049t.m12395p1(abstractComponentCallbacksC2591i);
                    break;
                case 6:
                    abstractComponentCallbacksC2591i.m12115D1(aVar.f10362d, aVar.f10363e, aVar.f10364f, aVar.f10365g);
                    this.f10049t.m12402v(abstractComponentCallbacksC2591i);
                    break;
                case 7:
                    abstractComponentCallbacksC2591i.m12115D1(aVar.f10362d, aVar.f10363e, aVar.f10364f, aVar.f10365g);
                    this.f10049t.m12388l1(abstractComponentCallbacksC2591i, false);
                    this.f10049t.m12389m(abstractComponentCallbacksC2591i);
                    break;
                case 8:
                    this.f10049t.m12392n1(abstractComponentCallbacksC2591i);
                    break;
                case 9:
                    this.f10049t.m12392n1(null);
                    break;
                case 10:
                    this.f10049t.m12390m1(abstractComponentCallbacksC2591i, aVar.f10367i);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    void m12030y() {
        for (int size = this.f10342c.size() - 1; size >= 0; size--) {
            AbstractC2606x.a aVar = (AbstractC2606x.a) this.f10342c.get(size);
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = aVar.f10360b;
            if (abstractComponentCallbacksC2591i != null) {
                abstractComponentCallbacksC2591i.f10171y = this.f10052w;
                abstractComponentCallbacksC2591i.m12131J1(true);
                abstractComponentCallbacksC2591i.m12128I1(AbstractC2599q.m12309h1(this.f10347h));
                abstractComponentCallbacksC2591i.m12139M1(this.f10356q, this.f10355p);
            }
            switch (aVar.f10359a) {
                case 1:
                    abstractComponentCallbacksC2591i.m12115D1(aVar.f10362d, aVar.f10363e, aVar.f10364f, aVar.f10365g);
                    this.f10049t.m12388l1(abstractComponentCallbacksC2591i, true);
                    this.f10049t.m12371c1(abstractComponentCallbacksC2591i);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f10359a);
                case 3:
                    abstractComponentCallbacksC2591i.m12115D1(aVar.f10362d, aVar.f10363e, aVar.f10364f, aVar.f10365g);
                    this.f10049t.m12378h(abstractComponentCallbacksC2591i);
                    break;
                case 4:
                    abstractComponentCallbacksC2591i.m12115D1(aVar.f10362d, aVar.f10363e, aVar.f10364f, aVar.f10365g);
                    this.f10049t.m12395p1(abstractComponentCallbacksC2591i);
                    break;
                case 5:
                    abstractComponentCallbacksC2591i.m12115D1(aVar.f10362d, aVar.f10363e, aVar.f10364f, aVar.f10365g);
                    this.f10049t.m12388l1(abstractComponentCallbacksC2591i, true);
                    this.f10049t.m12336F0(abstractComponentCallbacksC2591i);
                    break;
                case 6:
                    abstractComponentCallbacksC2591i.m12115D1(aVar.f10362d, aVar.f10363e, aVar.f10364f, aVar.f10365g);
                    this.f10049t.m12389m(abstractComponentCallbacksC2591i);
                    break;
                case 7:
                    abstractComponentCallbacksC2591i.m12115D1(aVar.f10362d, aVar.f10363e, aVar.f10364f, aVar.f10365g);
                    this.f10049t.m12388l1(abstractComponentCallbacksC2591i, true);
                    this.f10049t.m12402v(abstractComponentCallbacksC2591i);
                    break;
                case 8:
                    this.f10049t.m12392n1(null);
                    break;
                case 9:
                    this.f10049t.m12392n1(abstractComponentCallbacksC2591i);
                    break;
                case 10:
                    this.f10049t.m12390m1(abstractComponentCallbacksC2591i, aVar.f10366h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX INFO: renamed from: z */
    AbstractComponentCallbacksC2591i m12031z(ArrayList arrayList, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = abstractComponentCallbacksC2591i;
        int i7 = 0;
        while (i7 < this.f10342c.size()) {
            AbstractC2606x.a aVar = (AbstractC2606x.a) this.f10342c.get(i7);
            int i8 = aVar.f10359a;
            if (i8 == 1) {
                arrayList.add(aVar.f10360b);
            } else if (i8 == 2) {
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i3 = aVar.f10360b;
                int i9 = abstractComponentCallbacksC2591i3.f10128J;
                boolean z7 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i4 = (AbstractComponentCallbacksC2591i) arrayList.get(size);
                    if (abstractComponentCallbacksC2591i4.f10128J == i9) {
                        if (abstractComponentCallbacksC2591i4 == abstractComponentCallbacksC2591i3) {
                            z7 = true;
                        } else {
                            if (abstractComponentCallbacksC2591i4 == abstractComponentCallbacksC2591i2) {
                                this.f10342c.add(i7, new AbstractC2606x.a(9, abstractComponentCallbacksC2591i4, true));
                                i7++;
                                abstractComponentCallbacksC2591i2 = null;
                            }
                            AbstractC2606x.a aVar2 = new AbstractC2606x.a(3, abstractComponentCallbacksC2591i4, true);
                            aVar2.f10362d = aVar.f10362d;
                            aVar2.f10364f = aVar.f10364f;
                            aVar2.f10363e = aVar.f10363e;
                            aVar2.f10365g = aVar.f10365g;
                            this.f10342c.add(i7, aVar2);
                            arrayList.remove(abstractComponentCallbacksC2591i4);
                            i7++;
                        }
                    }
                }
                if (z7) {
                    this.f10342c.remove(i7);
                    i7--;
                } else {
                    aVar.f10359a = 1;
                    aVar.f10361c = true;
                    arrayList.add(abstractComponentCallbacksC2591i3);
                }
            } else if (i8 == 3 || i8 == 6) {
                arrayList.remove(aVar.f10360b);
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i5 = aVar.f10360b;
                if (abstractComponentCallbacksC2591i5 == abstractComponentCallbacksC2591i2) {
                    this.f10342c.add(i7, new AbstractC2606x.a(9, abstractComponentCallbacksC2591i5));
                    i7++;
                    abstractComponentCallbacksC2591i2 = null;
                }
            } else if (i8 == 7) {
                arrayList.add(aVar.f10360b);
            } else if (i8 == 8) {
                this.f10342c.add(i7, new AbstractC2606x.a(9, abstractComponentCallbacksC2591i2, true));
                aVar.f10361c = true;
                i7++;
                abstractComponentCallbacksC2591i2 = aVar.f10360b;
            }
            i7++;
        }
        return abstractComponentCallbacksC2591i2;
    }
}
