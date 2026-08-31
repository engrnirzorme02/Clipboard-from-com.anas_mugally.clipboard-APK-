package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.transition.t */
/* JADX INFO: loaded from: classes.dex */
public class C2852t extends AbstractC2843k {

    /* JADX INFO: renamed from: Z */
    int f11561Z;

    /* JADX INFO: renamed from: X */
    ArrayList f11559X = new ArrayList();

    /* JADX INFO: renamed from: Y */
    private boolean f11560Y = true;

    /* JADX INFO: renamed from: a0 */
    boolean f11562a0 = false;

    /* JADX INFO: renamed from: b0 */
    private int f11563b0 = 0;

    /* JADX INFO: renamed from: androidx.transition.t$a */
    class a extends AbstractC2849q {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC2843k f11564a;

        a(AbstractC2843k abstractC2843k) {
            this.f11564a = abstractC2843k;
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: d */
        public void mo14098d(AbstractC2843k abstractC2843k) {
            this.f11564a.mo14155X();
            abstractC2843k.mo14152T(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.t$b */
    static class b extends AbstractC2849q {

        /* JADX INFO: renamed from: a */
        C2852t f11566a;

        b(C2852t c2852t) {
            this.f11566a = c2852t;
        }

        @Override // androidx.transition.AbstractC2849q, androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: a */
        public void mo14096a(AbstractC2843k abstractC2843k) {
            C2852t c2852t = this.f11566a;
            if (c2852t.f11562a0) {
                return;
            }
            c2852t.m14165e0();
            this.f11566a.f11562a0 = true;
        }

        @Override // androidx.transition.AbstractC2843k.f
        /* JADX INFO: renamed from: d */
        public void mo14098d(AbstractC2843k abstractC2843k) {
            C2852t c2852t = this.f11566a;
            int i7 = c2852t.f11561Z - 1;
            c2852t.f11561Z = i7;
            if (i7 == 0) {
                c2852t.f11562a0 = false;
                c2852t.m14172q();
            }
            abstractC2843k.mo14152T(this);
        }
    }

    /* JADX INFO: renamed from: j0 */
    private void m14191j0(AbstractC2843k abstractC2843k) {
        this.f11559X.add(abstractC2843k);
        abstractC2843k.f11506C = this;
    }

    /* JADX INFO: renamed from: s0 */
    private void m14192s0() {
        b bVar = new b(this);
        Iterator it = this.f11559X.iterator();
        while (it.hasNext()) {
            ((AbstractC2843k) it.next()).mo14158a(bVar);
        }
        this.f11561Z = this.f11559X.size();
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: R */
    public void mo14150R(View view) {
        super.mo14150R(view);
        int size = this.f11559X.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC2843k) this.f11559X.get(i7)).mo14150R(view);
        }
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: V */
    public void mo14154V(View view) {
        super.mo14154V(view);
        int size = this.f11559X.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC2843k) this.f11559X.get(i7)).mo14154V(view);
        }
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: X */
    protected void mo14155X() {
        if (this.f11559X.isEmpty()) {
            m14165e0();
            m14172q();
            return;
        }
        m14192s0();
        if (this.f11560Y) {
            Iterator it = this.f11559X.iterator();
            while (it.hasNext()) {
                ((AbstractC2843k) it.next()).mo14155X();
            }
            return;
        }
        for (int i7 = 1; i7 < this.f11559X.size(); i7++) {
            ((AbstractC2843k) this.f11559X.get(i7 - 1)).mo14158a(new a((AbstractC2843k) this.f11559X.get(i7)));
        }
        AbstractC2843k abstractC2843k = (AbstractC2843k) this.f11559X.get(0);
        if (abstractC2843k != null) {
            abstractC2843k.mo14155X();
        }
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: Z */
    public void mo14157Z(AbstractC2843k.e eVar) {
        super.mo14157Z(eVar);
        this.f11563b0 |= 8;
        int size = this.f11559X.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC2843k) this.f11559X.get(i7)).mo14157Z(eVar);
        }
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: b0 */
    public void mo14161b0(AbstractC2839g abstractC2839g) {
        super.mo14161b0(abstractC2839g);
        this.f11563b0 |= 4;
        if (this.f11559X != null) {
            for (int i7 = 0; i7 < this.f11559X.size(); i7++) {
                ((AbstractC2843k) this.f11559X.get(i7)).mo14161b0(abstractC2839g);
            }
        }
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: c0 */
    public void mo14162c0(AbstractC2851s abstractC2851s) {
        super.mo14162c0(abstractC2851s);
        this.f11563b0 |= 2;
        int size = this.f11559X.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC2843k) this.f11559X.get(i7)).mo14162c0(abstractC2851s);
        }
    }

    @Override // androidx.transition.AbstractC2843k
    protected void cancel() {
        super.cancel();
        int size = this.f11559X.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC2843k) this.f11559X.get(i7)).cancel();
        }
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: f */
    public void mo14086f(C2854v c2854v) {
        if (m14148I(c2854v.f11569b)) {
            for (AbstractC2843k abstractC2843k : this.f11559X) {
                if (abstractC2843k.m14148I(c2854v.f11569b)) {
                    abstractC2843k.mo14086f(c2854v);
                    c2854v.f11570c.add(abstractC2843k);
                }
            }
        }
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: f0 */
    String mo14166f0(String str) {
        String strMo14166f0 = super.mo14166f0(str);
        for (int i7 = 0; i7 < this.f11559X.size(); i7++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strMo14166f0);
            sb.append("\n");
            sb.append(((AbstractC2843k) this.f11559X.get(i7)).mo14166f0(str + "  "));
            strMo14166f0 = sb.toString();
        }
        return strMo14166f0;
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public C2852t mo14158a(AbstractC2843k.f fVar) {
        return (C2852t) super.mo14158a(fVar);
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: h */
    void mo14167h(C2854v c2854v) {
        super.mo14167h(c2854v);
        int size = this.f11559X.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC2843k) this.f11559X.get(i7)).mo14167h(c2854v);
        }
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C2852t mo14160b(View view) {
        for (int i7 = 0; i7 < this.f11559X.size(); i7++) {
            ((AbstractC2843k) this.f11559X.get(i7)).mo14160b(view);
        }
        return (C2852t) super.mo14160b(view);
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: i */
    public void mo14087i(C2854v c2854v) {
        if (m14148I(c2854v.f11569b)) {
            for (AbstractC2843k abstractC2843k : this.f11559X) {
                if (abstractC2843k.m14148I(c2854v.f11569b)) {
                    abstractC2843k.mo14087i(c2854v);
                    c2854v.f11570c.add(abstractC2843k);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public C2852t m14195i0(AbstractC2843k abstractC2843k) {
        m14191j0(abstractC2843k);
        long j7 = this.f11525c;
        if (j7 >= 0) {
            abstractC2843k.mo14156Y(j7);
        }
        if ((this.f11563b0 & 1) != 0) {
            abstractC2843k.mo14159a0(m14175t());
        }
        if ((this.f11563b0 & 2) != 0) {
            m14179x();
            abstractC2843k.mo14162c0(null);
        }
        if ((this.f11563b0 & 4) != 0) {
            abstractC2843k.mo14161b0(m14178w());
        }
        if ((this.f11563b0 & 8) != 0) {
            abstractC2843k.mo14157Z(m14174s());
        }
        return this;
    }

    /* JADX INFO: renamed from: k0 */
    public AbstractC2843k m14196k0(int i7) {
        if (i7 < 0 || i7 >= this.f11559X.size()) {
            return null;
        }
        return (AbstractC2843k) this.f11559X.get(i7);
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC2843k clone() {
        C2852t c2852t = (C2852t) super.clone();
        c2852t.f11559X = new ArrayList();
        int size = this.f11559X.size();
        for (int i7 = 0; i7 < size; i7++) {
            c2852t.m14191j0(((AbstractC2843k) this.f11559X.get(i7)).clone());
        }
        return c2852t;
    }

    /* JADX INFO: renamed from: l0 */
    public int m14197l0() {
        return this.f11559X.size();
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C2852t mo14152T(AbstractC2843k.f fVar) {
        return (C2852t) super.mo14152T(fVar);
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C2852t mo14153U(View view) {
        for (int i7 = 0; i7 < this.f11559X.size(); i7++) {
            ((AbstractC2843k) this.f11559X.get(i7)).mo14153U(view);
        }
        return (C2852t) super.mo14153U(view);
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C2852t mo14156Y(long j7) {
        ArrayList arrayList;
        super.mo14156Y(j7);
        if (this.f11525c >= 0 && (arrayList = this.f11559X) != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC2843k) this.f11559X.get(i7)).mo14156Y(j7);
            }
        }
        return this;
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: p */
    void mo14171p(ViewGroup viewGroup, C2855w c2855w, C2855w c2855w2, ArrayList arrayList, ArrayList arrayList2) {
        long jM14142A = m14142A();
        int size = this.f11559X.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2843k abstractC2843k = (AbstractC2843k) this.f11559X.get(i7);
            if (jM14142A > 0 && (this.f11560Y || i7 == 0)) {
                long jM14142A2 = abstractC2843k.m14142A();
                if (jM14142A2 > 0) {
                    abstractC2843k.mo14163d0(jM14142A2 + jM14142A);
                } else {
                    abstractC2843k.mo14163d0(jM14142A);
                }
            }
            abstractC2843k.mo14171p(viewGroup, c2855w, c2855w2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C2852t mo14159a0(TimeInterpolator timeInterpolator) {
        this.f11563b0 |= 1;
        ArrayList arrayList = this.f11559X;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC2843k) this.f11559X.get(i7)).mo14159a0(timeInterpolator);
            }
        }
        return (C2852t) super.mo14159a0(timeInterpolator);
    }

    /* JADX INFO: renamed from: q0 */
    public C2852t m14202q0(int i7) {
        if (i7 == 0) {
            this.f11560Y = true;
            return this;
        }
        if (i7 == 1) {
            this.f11560Y = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i7);
    }

    @Override // androidx.transition.AbstractC2843k
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C2852t mo14163d0(long j7) {
        return (C2852t) super.mo14163d0(j7);
    }
}
