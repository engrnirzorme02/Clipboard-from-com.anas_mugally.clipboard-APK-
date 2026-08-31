package p240f0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C2558f;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: f0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5393f {

    /* JADX INFO: renamed from: a */
    private final b f20542a;

    /* JADX INFO: renamed from: f0.f$a */
    private static class a extends b {

        /* JADX INFO: renamed from: a */
        private final TextView f20543a;

        /* JADX INFO: renamed from: b */
        private final C5391d f20544b;

        /* JADX INFO: renamed from: c */
        private boolean f20545c = true;

        a(TextView textView) {
            this.f20543a = textView;
            this.f20544b = new C5391d(textView);
        }

        /* JADX INFO: renamed from: f */
        private InputFilter[] m24443f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f20544b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f20544b;
            return inputFilterArr2;
        }

        /* JADX INFO: renamed from: g */
        private SparseArray m24444g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof C5391d) {
                    sparseArray.put(i7, inputFilter);
                }
            }
            return sparseArray;
        }

        /* JADX INFO: renamed from: h */
        private InputFilter[] m24445h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayM24444g = m24444g(inputFilterArr);
            if (sparseArrayM24444g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayM24444g.size()];
            int i7 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                if (sparseArrayM24444g.indexOfKey(i8) < 0) {
                    inputFilterArr2[i7] = inputFilterArr[i8];
                    i7++;
                }
            }
            return inputFilterArr2;
        }

        /* JADX INFO: renamed from: j */
        private TransformationMethod m24446j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C5395h ? ((C5395h) transformationMethod).m24461a() : transformationMethod;
        }

        /* JADX INFO: renamed from: k */
        private void m24447k() {
            this.f20543a.setFilters(mo24449a(this.f20543a.getFilters()));
        }

        /* JADX INFO: renamed from: m */
        private TransformationMethod m24448m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof C5395h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C5395h(transformationMethod);
        }

        @Override // p240f0.C5393f.b
        /* JADX INFO: renamed from: a */
        InputFilter[] mo24449a(InputFilter[] inputFilterArr) {
            return !this.f20545c ? m24445h(inputFilterArr) : m24443f(inputFilterArr);
        }

        @Override // p240f0.C5393f.b
        /* JADX INFO: renamed from: b */
        public boolean mo24450b() {
            return this.f20545c;
        }

        @Override // p240f0.C5393f.b
        /* JADX INFO: renamed from: c */
        void mo24451c(boolean z7) {
            if (z7) {
                m24455l();
            }
        }

        @Override // p240f0.C5393f.b
        /* JADX INFO: renamed from: d */
        void mo24452d(boolean z7) {
            this.f20545c = z7;
            m24455l();
            m24447k();
        }

        @Override // p240f0.C5393f.b
        /* JADX INFO: renamed from: e */
        TransformationMethod mo24453e(TransformationMethod transformationMethod) {
            return this.f20545c ? m24448m(transformationMethod) : m24446j(transformationMethod);
        }

        /* JADX INFO: renamed from: i */
        void m24454i(boolean z7) {
            this.f20545c = z7;
        }

        /* JADX INFO: renamed from: l */
        void m24455l() {
            this.f20543a.setTransformationMethod(mo24453e(this.f20543a.getTransformationMethod()));
        }
    }

    /* JADX INFO: renamed from: f0.f$b */
    static class b {
        b() {
        }

        /* JADX INFO: renamed from: a */
        abstract InputFilter[] mo24449a(InputFilter[] inputFilterArr);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo24450b();

        /* JADX INFO: renamed from: c */
        abstract void mo24451c(boolean z7);

        /* JADX INFO: renamed from: d */
        abstract void mo24452d(boolean z7);

        /* JADX INFO: renamed from: e */
        abstract TransformationMethod mo24453e(TransformationMethod transformationMethod);
    }

    /* JADX INFO: renamed from: f0.f$c */
    private static class c extends b {

        /* JADX INFO: renamed from: a */
        private final a f20546a;

        c(TextView textView) {
            this.f20546a = new a(textView);
        }

        /* JADX INFO: renamed from: f */
        private boolean m24456f() {
            return !C2558f.m11755i();
        }

        @Override // p240f0.C5393f.b
        /* JADX INFO: renamed from: a */
        InputFilter[] mo24449a(InputFilter[] inputFilterArr) {
            return m24456f() ? inputFilterArr : this.f20546a.mo24449a(inputFilterArr);
        }

        @Override // p240f0.C5393f.b
        /* JADX INFO: renamed from: b */
        public boolean mo24450b() {
            return this.f20546a.mo24450b();
        }

        @Override // p240f0.C5393f.b
        /* JADX INFO: renamed from: c */
        void mo24451c(boolean z7) {
            if (m24456f()) {
                return;
            }
            this.f20546a.mo24451c(z7);
        }

        @Override // p240f0.C5393f.b
        /* JADX INFO: renamed from: d */
        void mo24452d(boolean z7) {
            if (m24456f()) {
                this.f20546a.m24454i(z7);
            } else {
                this.f20546a.mo24452d(z7);
            }
        }

        @Override // p240f0.C5393f.b
        /* JADX INFO: renamed from: e */
        TransformationMethod mo24453e(TransformationMethod transformationMethod) {
            return m24456f() ? transformationMethod : this.f20546a.mo24453e(transformationMethod);
        }
    }

    public C5393f(TextView textView, boolean z7) {
        AbstractC0910g.m4140h(textView, "textView cannot be null");
        if (z7) {
            this.f20542a = new a(textView);
        } else {
            this.f20542a = new c(textView);
        }
    }

    /* JADX INFO: renamed from: a */
    public InputFilter[] m24438a(InputFilter[] inputFilterArr) {
        return this.f20542a.mo24449a(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public boolean m24439b() {
        return this.f20542a.mo24450b();
    }

    /* JADX INFO: renamed from: c */
    public void m24440c(boolean z7) {
        this.f20542a.mo24451c(z7);
    }

    /* JADX INFO: renamed from: d */
    public void m24441d(boolean z7) {
        this.f20542a.mo24452d(z7);
    }

    /* JADX INFO: renamed from: e */
    public TransformationMethod m24442e(TransformationMethod transformationMethod) {
        return this.f20542a.mo24453e(transformationMethod);
    }
}
