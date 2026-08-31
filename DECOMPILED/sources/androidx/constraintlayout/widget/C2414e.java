package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbbn;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p369v.C7198a;
import p401z.AbstractC7556a;
import p401z.AbstractC7557b;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.e */
/* JADX INFO: loaded from: classes.dex */
public class C2414e {

    /* JADX INFO: renamed from: g */
    private static final int[] f8671g = {0, 4, 8};

    /* JADX INFO: renamed from: h */
    private static SparseIntArray f8672h = new SparseIntArray();

    /* JADX INFO: renamed from: i */
    private static SparseIntArray f8673i = new SparseIntArray();

    /* JADX INFO: renamed from: a */
    public String f8674a = "";

    /* JADX INFO: renamed from: b */
    private String[] f8675b = new String[0];

    /* JADX INFO: renamed from: c */
    public int f8676c = 0;

    /* JADX INFO: renamed from: d */
    private HashMap f8677d = new HashMap();

    /* JADX INFO: renamed from: e */
    private boolean f8678e = true;

    /* JADX INFO: renamed from: f */
    private HashMap f8679f = new HashMap();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        int f8680a;

        /* JADX INFO: renamed from: b */
        String f8681b;

        /* JADX INFO: renamed from: c */
        public final d f8682c = new d();

        /* JADX INFO: renamed from: d */
        public final c f8683d = new c();

        /* JADX INFO: renamed from: e */
        public final b f8684e = new b();

        /* JADX INFO: renamed from: f */
        public final e f8685f = new e();

        /* JADX INFO: renamed from: g */
        public HashMap f8686g = new HashMap();

        /* JADX INFO: renamed from: h */
        C7662a f8687h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$a$a, reason: collision with other inner class name */
        static class C7662a {

            /* JADX INFO: renamed from: a */
            int[] f8688a = new int[10];

            /* JADX INFO: renamed from: b */
            int[] f8689b = new int[10];

            /* JADX INFO: renamed from: c */
            int f8690c = 0;

            /* JADX INFO: renamed from: d */
            int[] f8691d = new int[10];

            /* JADX INFO: renamed from: e */
            float[] f8692e = new float[10];

            /* JADX INFO: renamed from: f */
            int f8693f = 0;

            /* JADX INFO: renamed from: g */
            int[] f8694g = new int[5];

            /* JADX INFO: renamed from: h */
            String[] f8695h = new String[5];

            /* JADX INFO: renamed from: i */
            int f8696i = 0;

            /* JADX INFO: renamed from: j */
            int[] f8697j = new int[4];

            /* JADX INFO: renamed from: k */
            boolean[] f8698k = new boolean[4];

            /* JADX INFO: renamed from: l */
            int f8699l = 0;

            C7662a() {
            }

            /* JADX INFO: renamed from: a */
            void m10426a(int i7, float f7) {
                int i8 = this.f8693f;
                int[] iArr = this.f8691d;
                if (i8 >= iArr.length) {
                    this.f8691d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f8692e;
                    this.f8692e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f8691d;
                int i9 = this.f8693f;
                iArr2[i9] = i7;
                float[] fArr2 = this.f8692e;
                this.f8693f = i9 + 1;
                fArr2[i9] = f7;
            }

            /* JADX INFO: renamed from: b */
            void m10427b(int i7, int i8) {
                int i9 = this.f8690c;
                int[] iArr = this.f8688a;
                if (i9 >= iArr.length) {
                    this.f8688a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f8689b;
                    this.f8689b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f8688a;
                int i10 = this.f8690c;
                iArr3[i10] = i7;
                int[] iArr4 = this.f8689b;
                this.f8690c = i10 + 1;
                iArr4[i10] = i8;
            }

            /* JADX INFO: renamed from: c */
            void m10428c(int i7, String str) {
                int i8 = this.f8696i;
                int[] iArr = this.f8694g;
                if (i8 >= iArr.length) {
                    this.f8694g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f8695h;
                    this.f8695h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f8694g;
                int i9 = this.f8696i;
                iArr2[i9] = i7;
                String[] strArr2 = this.f8695h;
                this.f8696i = i9 + 1;
                strArr2[i9] = str;
            }

            /* JADX INFO: renamed from: d */
            void m10429d(int i7, boolean z7) {
                int i8 = this.f8699l;
                int[] iArr = this.f8697j;
                if (i8 >= iArr.length) {
                    this.f8697j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f8698k;
                    this.f8698k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f8697j;
                int i9 = this.f8699l;
                iArr2[i9] = i7;
                boolean[] zArr2 = this.f8698k;
                this.f8699l = i9 + 1;
                zArr2[i9] = z7;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public void m10423d(int i7, ConstraintLayout.C2408b c2408b) {
            this.f8680a = i7;
            b bVar = this.f8684e;
            bVar.f8745j = c2408b.f8577e;
            bVar.f8747k = c2408b.f8579f;
            bVar.f8749l = c2408b.f8581g;
            bVar.f8751m = c2408b.f8583h;
            bVar.f8753n = c2408b.f8585i;
            bVar.f8755o = c2408b.f8587j;
            bVar.f8757p = c2408b.f8589k;
            bVar.f8759q = c2408b.f8591l;
            bVar.f8761r = c2408b.f8593m;
            bVar.f8762s = c2408b.f8595n;
            bVar.f8763t = c2408b.f8597o;
            bVar.f8764u = c2408b.f8605s;
            bVar.f8765v = c2408b.f8607t;
            bVar.f8766w = c2408b.f8609u;
            bVar.f8767x = c2408b.f8611v;
            bVar.f8768y = c2408b.f8549G;
            bVar.f8769z = c2408b.f8550H;
            bVar.f8701A = c2408b.f8551I;
            bVar.f8702B = c2408b.f8599p;
            bVar.f8703C = c2408b.f8601q;
            bVar.f8704D = c2408b.f8603r;
            bVar.f8705E = c2408b.f8566X;
            bVar.f8706F = c2408b.f8567Y;
            bVar.f8707G = c2408b.f8568Z;
            bVar.f8741h = c2408b.f8573c;
            bVar.f8737f = c2408b.f8569a;
            bVar.f8739g = c2408b.f8571b;
            bVar.f8733d = ((ViewGroup.MarginLayoutParams) c2408b).width;
            bVar.f8735e = ((ViewGroup.MarginLayoutParams) c2408b).height;
            bVar.f8708H = ((ViewGroup.MarginLayoutParams) c2408b).leftMargin;
            bVar.f8709I = ((ViewGroup.MarginLayoutParams) c2408b).rightMargin;
            bVar.f8710J = ((ViewGroup.MarginLayoutParams) c2408b).topMargin;
            bVar.f8711K = ((ViewGroup.MarginLayoutParams) c2408b).bottomMargin;
            bVar.f8714N = c2408b.f8546D;
            bVar.f8722V = c2408b.f8555M;
            bVar.f8723W = c2408b.f8554L;
            bVar.f8725Y = c2408b.f8557O;
            bVar.f8724X = c2408b.f8556N;
            bVar.f8754n0 = c2408b.f8570a0;
            bVar.f8756o0 = c2408b.f8572b0;
            bVar.f8726Z = c2408b.f8558P;
            bVar.f8728a0 = c2408b.f8559Q;
            bVar.f8730b0 = c2408b.f8562T;
            bVar.f8732c0 = c2408b.f8563U;
            bVar.f8734d0 = c2408b.f8560R;
            bVar.f8736e0 = c2408b.f8561S;
            bVar.f8738f0 = c2408b.f8564V;
            bVar.f8740g0 = c2408b.f8565W;
            bVar.f8752m0 = c2408b.f8574c0;
            bVar.f8716P = c2408b.f8615x;
            bVar.f8718R = c2408b.f8617z;
            bVar.f8715O = c2408b.f8613w;
            bVar.f8717Q = c2408b.f8616y;
            bVar.f8720T = c2408b.f8543A;
            bVar.f8719S = c2408b.f8544B;
            bVar.f8721U = c2408b.f8545C;
            bVar.f8760q0 = c2408b.f8576d0;
            bVar.f8712L = c2408b.getMarginEnd();
            this.f8684e.f8713M = c2408b.getMarginStart();
        }

        /* JADX INFO: renamed from: b */
        public void m10424b(ConstraintLayout.C2408b c2408b) {
            b bVar = this.f8684e;
            c2408b.f8577e = bVar.f8745j;
            c2408b.f8579f = bVar.f8747k;
            c2408b.f8581g = bVar.f8749l;
            c2408b.f8583h = bVar.f8751m;
            c2408b.f8585i = bVar.f8753n;
            c2408b.f8587j = bVar.f8755o;
            c2408b.f8589k = bVar.f8757p;
            c2408b.f8591l = bVar.f8759q;
            c2408b.f8593m = bVar.f8761r;
            c2408b.f8595n = bVar.f8762s;
            c2408b.f8597o = bVar.f8763t;
            c2408b.f8605s = bVar.f8764u;
            c2408b.f8607t = bVar.f8765v;
            c2408b.f8609u = bVar.f8766w;
            c2408b.f8611v = bVar.f8767x;
            ((ViewGroup.MarginLayoutParams) c2408b).leftMargin = bVar.f8708H;
            ((ViewGroup.MarginLayoutParams) c2408b).rightMargin = bVar.f8709I;
            ((ViewGroup.MarginLayoutParams) c2408b).topMargin = bVar.f8710J;
            ((ViewGroup.MarginLayoutParams) c2408b).bottomMargin = bVar.f8711K;
            c2408b.f8543A = bVar.f8720T;
            c2408b.f8544B = bVar.f8719S;
            c2408b.f8615x = bVar.f8716P;
            c2408b.f8617z = bVar.f8718R;
            c2408b.f8549G = bVar.f8768y;
            c2408b.f8550H = bVar.f8769z;
            c2408b.f8599p = bVar.f8702B;
            c2408b.f8601q = bVar.f8703C;
            c2408b.f8603r = bVar.f8704D;
            c2408b.f8551I = bVar.f8701A;
            c2408b.f8566X = bVar.f8705E;
            c2408b.f8567Y = bVar.f8706F;
            c2408b.f8555M = bVar.f8722V;
            c2408b.f8554L = bVar.f8723W;
            c2408b.f8557O = bVar.f8725Y;
            c2408b.f8556N = bVar.f8724X;
            c2408b.f8570a0 = bVar.f8754n0;
            c2408b.f8572b0 = bVar.f8756o0;
            c2408b.f8558P = bVar.f8726Z;
            c2408b.f8559Q = bVar.f8728a0;
            c2408b.f8562T = bVar.f8730b0;
            c2408b.f8563U = bVar.f8732c0;
            c2408b.f8560R = bVar.f8734d0;
            c2408b.f8561S = bVar.f8736e0;
            c2408b.f8564V = bVar.f8738f0;
            c2408b.f8565W = bVar.f8740g0;
            c2408b.f8568Z = bVar.f8707G;
            c2408b.f8573c = bVar.f8741h;
            c2408b.f8569a = bVar.f8737f;
            c2408b.f8571b = bVar.f8739g;
            ((ViewGroup.MarginLayoutParams) c2408b).width = bVar.f8733d;
            ((ViewGroup.MarginLayoutParams) c2408b).height = bVar.f8735e;
            String str = bVar.f8752m0;
            if (str != null) {
                c2408b.f8574c0 = str;
            }
            c2408b.f8576d0 = bVar.f8760q0;
            c2408b.setMarginStart(bVar.f8713M);
            c2408b.setMarginEnd(this.f8684e.f8712L);
            c2408b.m10376a();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f8684e.m10430a(this.f8684e);
            aVar.f8683d.m10432a(this.f8683d);
            aVar.f8682c.m10434a(this.f8682c);
            aVar.f8685f.m10436a(this.f8685f);
            aVar.f8680a = this.f8680a;
            aVar.f8687h = this.f8687h;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$b */
    public static class b {

        /* JADX INFO: renamed from: r0 */
        private static SparseIntArray f8700r0;

        /* JADX INFO: renamed from: d */
        public int f8733d;

        /* JADX INFO: renamed from: e */
        public int f8735e;

        /* JADX INFO: renamed from: k0 */
        public int[] f8748k0;

        /* JADX INFO: renamed from: l0 */
        public String f8750l0;

        /* JADX INFO: renamed from: m0 */
        public String f8752m0;

        /* JADX INFO: renamed from: a */
        public boolean f8727a = false;

        /* JADX INFO: renamed from: b */
        public boolean f8729b = false;

        /* JADX INFO: renamed from: c */
        public boolean f8731c = false;

        /* JADX INFO: renamed from: f */
        public int f8737f = -1;

        /* JADX INFO: renamed from: g */
        public int f8739g = -1;

        /* JADX INFO: renamed from: h */
        public float f8741h = -1.0f;

        /* JADX INFO: renamed from: i */
        public boolean f8743i = true;

        /* JADX INFO: renamed from: j */
        public int f8745j = -1;

        /* JADX INFO: renamed from: k */
        public int f8747k = -1;

        /* JADX INFO: renamed from: l */
        public int f8749l = -1;

        /* JADX INFO: renamed from: m */
        public int f8751m = -1;

        /* JADX INFO: renamed from: n */
        public int f8753n = -1;

        /* JADX INFO: renamed from: o */
        public int f8755o = -1;

        /* JADX INFO: renamed from: p */
        public int f8757p = -1;

        /* JADX INFO: renamed from: q */
        public int f8759q = -1;

        /* JADX INFO: renamed from: r */
        public int f8761r = -1;

        /* JADX INFO: renamed from: s */
        public int f8762s = -1;

        /* JADX INFO: renamed from: t */
        public int f8763t = -1;

        /* JADX INFO: renamed from: u */
        public int f8764u = -1;

        /* JADX INFO: renamed from: v */
        public int f8765v = -1;

        /* JADX INFO: renamed from: w */
        public int f8766w = -1;

        /* JADX INFO: renamed from: x */
        public int f8767x = -1;

        /* JADX INFO: renamed from: y */
        public float f8768y = 0.5f;

        /* JADX INFO: renamed from: z */
        public float f8769z = 0.5f;

        /* JADX INFO: renamed from: A */
        public String f8701A = null;

        /* JADX INFO: renamed from: B */
        public int f8702B = -1;

        /* JADX INFO: renamed from: C */
        public int f8703C = 0;

        /* JADX INFO: renamed from: D */
        public float f8704D = 0.0f;

        /* JADX INFO: renamed from: E */
        public int f8705E = -1;

        /* JADX INFO: renamed from: F */
        public int f8706F = -1;

        /* JADX INFO: renamed from: G */
        public int f8707G = -1;

        /* JADX INFO: renamed from: H */
        public int f8708H = 0;

        /* JADX INFO: renamed from: I */
        public int f8709I = 0;

        /* JADX INFO: renamed from: J */
        public int f8710J = 0;

        /* JADX INFO: renamed from: K */
        public int f8711K = 0;

        /* JADX INFO: renamed from: L */
        public int f8712L = 0;

        /* JADX INFO: renamed from: M */
        public int f8713M = 0;

        /* JADX INFO: renamed from: N */
        public int f8714N = 0;

        /* JADX INFO: renamed from: O */
        public int f8715O = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: P */
        public int f8716P = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Q */
        public int f8717Q = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: R */
        public int f8718R = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: S */
        public int f8719S = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: T */
        public int f8720T = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: U */
        public int f8721U = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: V */
        public float f8722V = -1.0f;

        /* JADX INFO: renamed from: W */
        public float f8723W = -1.0f;

        /* JADX INFO: renamed from: X */
        public int f8724X = 0;

        /* JADX INFO: renamed from: Y */
        public int f8725Y = 0;

        /* JADX INFO: renamed from: Z */
        public int f8726Z = 0;

        /* JADX INFO: renamed from: a0 */
        public int f8728a0 = 0;

        /* JADX INFO: renamed from: b0 */
        public int f8730b0 = 0;

        /* JADX INFO: renamed from: c0 */
        public int f8732c0 = 0;

        /* JADX INFO: renamed from: d0 */
        public int f8734d0 = 0;

        /* JADX INFO: renamed from: e0 */
        public int f8736e0 = 0;

        /* JADX INFO: renamed from: f0 */
        public float f8738f0 = 1.0f;

        /* JADX INFO: renamed from: g0 */
        public float f8740g0 = 1.0f;

        /* JADX INFO: renamed from: h0 */
        public int f8742h0 = -1;

        /* JADX INFO: renamed from: i0 */
        public int f8744i0 = 0;

        /* JADX INFO: renamed from: j0 */
        public int f8746j0 = -1;

        /* JADX INFO: renamed from: n0 */
        public boolean f8754n0 = false;

        /* JADX INFO: renamed from: o0 */
        public boolean f8756o0 = false;

        /* JADX INFO: renamed from: p0 */
        public boolean f8758p0 = true;

        /* JADX INFO: renamed from: q0 */
        public int f8760q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8700r0 = sparseIntArray;
            sparseIntArray.append(AbstractC2418i.f8828C5, 24);
            f8700r0.append(AbstractC2418i.f8836D5, 25);
            f8700r0.append(AbstractC2418i.f8852F5, 28);
            f8700r0.append(AbstractC2418i.f8860G5, 29);
            f8700r0.append(AbstractC2418i.f8900L5, 35);
            f8700r0.append(AbstractC2418i.f8892K5, 34);
            f8700r0.append(AbstractC2418i.f9110l5, 4);
            f8700r0.append(AbstractC2418i.f9102k5, 3);
            f8700r0.append(AbstractC2418i.f9086i5, 1);
            f8700r0.append(AbstractC2418i.f8964T5, 6);
            f8700r0.append(AbstractC2418i.f8972U5, 7);
            f8700r0.append(AbstractC2418i.f9166s5, 17);
            f8700r0.append(AbstractC2418i.f9174t5, 18);
            f8700r0.append(AbstractC2418i.f9182u5, 19);
            SparseIntArray sparseIntArray2 = f8700r0;
            int i7 = AbstractC2418i.f9054e5;
            sparseIntArray2.append(i7, 90);
            f8700r0.append(AbstractC2418i.f8939Q4, 26);
            f8700r0.append(AbstractC2418i.f8868H5, 31);
            f8700r0.append(AbstractC2418i.f8876I5, 32);
            f8700r0.append(AbstractC2418i.f9158r5, 10);
            f8700r0.append(AbstractC2418i.f9150q5, 9);
            f8700r0.append(AbstractC2418i.f8996X5, 13);
            f8700r0.append(AbstractC2418i.f9021a6, 16);
            f8700r0.append(AbstractC2418i.f9004Y5, 14);
            f8700r0.append(AbstractC2418i.f8980V5, 11);
            f8700r0.append(AbstractC2418i.f9012Z5, 15);
            f8700r0.append(AbstractC2418i.f8988W5, 12);
            f8700r0.append(AbstractC2418i.f8924O5, 38);
            f8700r0.append(AbstractC2418i.f8812A5, 37);
            f8700r0.append(AbstractC2418i.f9222z5, 39);
            f8700r0.append(AbstractC2418i.f8916N5, 40);
            f8700r0.append(AbstractC2418i.f9214y5, 20);
            f8700r0.append(AbstractC2418i.f8908M5, 36);
            f8700r0.append(AbstractC2418i.f9142p5, 5);
            f8700r0.append(AbstractC2418i.f8820B5, 91);
            f8700r0.append(AbstractC2418i.f8884J5, 91);
            f8700r0.append(AbstractC2418i.f8844E5, 91);
            f8700r0.append(AbstractC2418i.f9094j5, 91);
            f8700r0.append(AbstractC2418i.f9078h5, 91);
            f8700r0.append(AbstractC2418i.f8963T4, 23);
            f8700r0.append(AbstractC2418i.f8979V4, 27);
            f8700r0.append(AbstractC2418i.f8995X4, 30);
            f8700r0.append(AbstractC2418i.f9003Y4, 8);
            f8700r0.append(AbstractC2418i.f8971U4, 33);
            f8700r0.append(AbstractC2418i.f8987W4, 2);
            f8700r0.append(AbstractC2418i.f8947R4, 22);
            f8700r0.append(AbstractC2418i.f8955S4, 21);
            SparseIntArray sparseIntArray3 = f8700r0;
            int i8 = AbstractC2418i.f8932P5;
            sparseIntArray3.append(i8, 41);
            SparseIntArray sparseIntArray4 = f8700r0;
            int i9 = AbstractC2418i.f9190v5;
            sparseIntArray4.append(i9, 42);
            f8700r0.append(AbstractC2418i.f9070g5, 87);
            f8700r0.append(AbstractC2418i.f9062f5, 88);
            f8700r0.append(AbstractC2418i.f9030b6, 76);
            f8700r0.append(AbstractC2418i.f9118m5, 61);
            f8700r0.append(AbstractC2418i.f9134o5, 62);
            f8700r0.append(AbstractC2418i.f9126n5, 63);
            f8700r0.append(AbstractC2418i.f8956S5, 69);
            f8700r0.append(AbstractC2418i.f9206x5, 70);
            f8700r0.append(AbstractC2418i.f9038c5, 71);
            f8700r0.append(AbstractC2418i.f9020a5, 72);
            f8700r0.append(AbstractC2418i.f9029b5, 73);
            f8700r0.append(AbstractC2418i.f9046d5, 74);
            f8700r0.append(AbstractC2418i.f9011Z4, 75);
            SparseIntArray sparseIntArray5 = f8700r0;
            int i10 = AbstractC2418i.f8940Q5;
            sparseIntArray5.append(i10, 84);
            f8700r0.append(AbstractC2418i.f8948R5, 86);
            f8700r0.append(i10, 83);
            f8700r0.append(AbstractC2418i.f9198w5, 85);
            f8700r0.append(i8, 87);
            f8700r0.append(i9, 88);
            f8700r0.append(AbstractC2418i.f9163s2, 89);
            f8700r0.append(i7, 90);
        }

        /* JADX INFO: renamed from: a */
        public void m10430a(b bVar) {
            this.f8727a = bVar.f8727a;
            this.f8733d = bVar.f8733d;
            this.f8729b = bVar.f8729b;
            this.f8735e = bVar.f8735e;
            this.f8737f = bVar.f8737f;
            this.f8739g = bVar.f8739g;
            this.f8741h = bVar.f8741h;
            this.f8743i = bVar.f8743i;
            this.f8745j = bVar.f8745j;
            this.f8747k = bVar.f8747k;
            this.f8749l = bVar.f8749l;
            this.f8751m = bVar.f8751m;
            this.f8753n = bVar.f8753n;
            this.f8755o = bVar.f8755o;
            this.f8757p = bVar.f8757p;
            this.f8759q = bVar.f8759q;
            this.f8761r = bVar.f8761r;
            this.f8762s = bVar.f8762s;
            this.f8763t = bVar.f8763t;
            this.f8764u = bVar.f8764u;
            this.f8765v = bVar.f8765v;
            this.f8766w = bVar.f8766w;
            this.f8767x = bVar.f8767x;
            this.f8768y = bVar.f8768y;
            this.f8769z = bVar.f8769z;
            this.f8701A = bVar.f8701A;
            this.f8702B = bVar.f8702B;
            this.f8703C = bVar.f8703C;
            this.f8704D = bVar.f8704D;
            this.f8705E = bVar.f8705E;
            this.f8706F = bVar.f8706F;
            this.f8707G = bVar.f8707G;
            this.f8708H = bVar.f8708H;
            this.f8709I = bVar.f8709I;
            this.f8710J = bVar.f8710J;
            this.f8711K = bVar.f8711K;
            this.f8712L = bVar.f8712L;
            this.f8713M = bVar.f8713M;
            this.f8714N = bVar.f8714N;
            this.f8715O = bVar.f8715O;
            this.f8716P = bVar.f8716P;
            this.f8717Q = bVar.f8717Q;
            this.f8718R = bVar.f8718R;
            this.f8719S = bVar.f8719S;
            this.f8720T = bVar.f8720T;
            this.f8721U = bVar.f8721U;
            this.f8722V = bVar.f8722V;
            this.f8723W = bVar.f8723W;
            this.f8724X = bVar.f8724X;
            this.f8725Y = bVar.f8725Y;
            this.f8726Z = bVar.f8726Z;
            this.f8728a0 = bVar.f8728a0;
            this.f8730b0 = bVar.f8730b0;
            this.f8732c0 = bVar.f8732c0;
            this.f8734d0 = bVar.f8734d0;
            this.f8736e0 = bVar.f8736e0;
            this.f8738f0 = bVar.f8738f0;
            this.f8740g0 = bVar.f8740g0;
            this.f8742h0 = bVar.f8742h0;
            this.f8744i0 = bVar.f8744i0;
            this.f8746j0 = bVar.f8746j0;
            this.f8752m0 = bVar.f8752m0;
            int[] iArr = bVar.f8748k0;
            if (iArr == null || bVar.f8750l0 != null) {
                this.f8748k0 = null;
            } else {
                this.f8748k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f8750l0 = bVar.f8750l0;
            this.f8754n0 = bVar.f8754n0;
            this.f8756o0 = bVar.f8756o0;
            this.f8758p0 = bVar.f8758p0;
            this.f8760q0 = bVar.f8760q0;
        }

        /* JADX INFO: renamed from: b */
        void m10431b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2418i.f8931P4);
            this.f8729b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                int i8 = f8700r0.get(index);
                switch (i8) {
                    case 1:
                        this.f8761r = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8761r);
                        break;
                    case 2:
                        this.f8711K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8711K);
                        break;
                    case 3:
                        this.f8759q = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8759q);
                        break;
                    case 4:
                        this.f8757p = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8757p);
                        break;
                    case 5:
                        this.f8701A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f8705E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8705E);
                        break;
                    case 7:
                        this.f8706F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8706F);
                        break;
                    case 8:
                        this.f8712L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8712L);
                        break;
                    case 9:
                        this.f8767x = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8767x);
                        break;
                    case 10:
                        this.f8766w = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8766w);
                        break;
                    case 11:
                        this.f8718R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8718R);
                        break;
                    case 12:
                        this.f8719S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8719S);
                        break;
                    case 13:
                        this.f8715O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8715O);
                        break;
                    case 14:
                        this.f8717Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8717Q);
                        break;
                    case 15:
                        this.f8720T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8720T);
                        break;
                    case 16:
                        this.f8716P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8716P);
                        break;
                    case 17:
                        this.f8737f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8737f);
                        break;
                    case 18:
                        this.f8739g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8739g);
                        break;
                    case 19:
                        this.f8741h = typedArrayObtainStyledAttributes.getFloat(index, this.f8741h);
                        break;
                    case 20:
                        this.f8768y = typedArrayObtainStyledAttributes.getFloat(index, this.f8768y);
                        break;
                    case zzbbn.zzt.zzm /* 21 */:
                        this.f8735e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f8735e);
                        break;
                    case 22:
                        this.f8733d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f8733d);
                        break;
                    case 23:
                        this.f8708H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8708H);
                        break;
                    case 24:
                        this.f8745j = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8745j);
                        break;
                    case 25:
                        this.f8747k = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8747k);
                        break;
                    case 26:
                        this.f8707G = typedArrayObtainStyledAttributes.getInt(index, this.f8707G);
                        break;
                    case 27:
                        this.f8709I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8709I);
                        break;
                    case 28:
                        this.f8749l = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8749l);
                        break;
                    case 29:
                        this.f8751m = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8751m);
                        break;
                    case 30:
                        this.f8713M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8713M);
                        break;
                    case 31:
                        this.f8764u = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8764u);
                        break;
                    case 32:
                        this.f8765v = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8765v);
                        break;
                    case 33:
                        this.f8710J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8710J);
                        break;
                    case 34:
                        this.f8755o = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8755o);
                        break;
                    case 35:
                        this.f8753n = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8753n);
                        break;
                    case 36:
                        this.f8769z = typedArrayObtainStyledAttributes.getFloat(index, this.f8769z);
                        break;
                    case 37:
                        this.f8723W = typedArrayObtainStyledAttributes.getFloat(index, this.f8723W);
                        break;
                    case 38:
                        this.f8722V = typedArrayObtainStyledAttributes.getFloat(index, this.f8722V);
                        break;
                    case 39:
                        this.f8724X = typedArrayObtainStyledAttributes.getInt(index, this.f8724X);
                        break;
                    case 40:
                        this.f8725Y = typedArrayObtainStyledAttributes.getInt(index, this.f8725Y);
                        break;
                    case 41:
                        C2414e.m10410n(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        C2414e.m10410n(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i8) {
                            case 61:
                                this.f8702B = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8702B);
                                break;
                            case 62:
                                this.f8703C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8703C);
                                break;
                            case 63:
                                this.f8704D = typedArrayObtainStyledAttributes.getFloat(index, this.f8704D);
                                break;
                            default:
                                switch (i8) {
                                    case 69:
                                        this.f8738f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f8740g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f8742h0 = typedArrayObtainStyledAttributes.getInt(index, this.f8742h0);
                                        break;
                                    case 73:
                                        this.f8744i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8744i0);
                                        break;
                                    case 74:
                                        this.f8750l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f8758p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f8758p0);
                                        break;
                                    case 76:
                                        this.f8760q0 = typedArrayObtainStyledAttributes.getInt(index, this.f8760q0);
                                        break;
                                    case 77:
                                        this.f8762s = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8762s);
                                        break;
                                    case 78:
                                        this.f8763t = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8763t);
                                        break;
                                    case 79:
                                        this.f8721U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8721U);
                                        break;
                                    case 80:
                                        this.f8714N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8714N);
                                        break;
                                    case 81:
                                        this.f8726Z = typedArrayObtainStyledAttributes.getInt(index, this.f8726Z);
                                        break;
                                    case 82:
                                        this.f8728a0 = typedArrayObtainStyledAttributes.getInt(index, this.f8728a0);
                                        break;
                                    case 83:
                                        this.f8732c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8732c0);
                                        break;
                                    case 84:
                                        this.f8730b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8730b0);
                                        break;
                                    case 85:
                                        this.f8736e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8736e0);
                                        break;
                                    case 86:
                                        this.f8734d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8734d0);
                                        break;
                                    case 87:
                                        this.f8754n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f8754n0);
                                        break;
                                    case 88:
                                        this.f8756o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f8756o0);
                                        break;
                                    case 89:
                                        this.f8752m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f8743i = typedArrayObtainStyledAttributes.getBoolean(index, this.f8743i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8700r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8700r0.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$c */
    public static class c {

        /* JADX INFO: renamed from: o */
        private static SparseIntArray f8770o;

        /* JADX INFO: renamed from: a */
        public boolean f8771a = false;

        /* JADX INFO: renamed from: b */
        public int f8772b = -1;

        /* JADX INFO: renamed from: c */
        public int f8773c = 0;

        /* JADX INFO: renamed from: d */
        public String f8774d = null;

        /* JADX INFO: renamed from: e */
        public int f8775e = -1;

        /* JADX INFO: renamed from: f */
        public int f8776f = 0;

        /* JADX INFO: renamed from: g */
        public float f8777g = Float.NaN;

        /* JADX INFO: renamed from: h */
        public int f8778h = -1;

        /* JADX INFO: renamed from: i */
        public float f8779i = Float.NaN;

        /* JADX INFO: renamed from: j */
        public float f8780j = Float.NaN;

        /* JADX INFO: renamed from: k */
        public int f8781k = -1;

        /* JADX INFO: renamed from: l */
        public String f8782l = null;

        /* JADX INFO: renamed from: m */
        public int f8783m = -3;

        /* JADX INFO: renamed from: n */
        public int f8784n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8770o = sparseIntArray;
            sparseIntArray.append(AbstractC2418i.f9079h6, 1);
            f8770o.append(AbstractC2418i.f9095j6, 2);
            f8770o.append(AbstractC2418i.f9127n6, 3);
            f8770o.append(AbstractC2418i.f9071g6, 4);
            f8770o.append(AbstractC2418i.f9063f6, 5);
            f8770o.append(AbstractC2418i.f9055e6, 6);
            f8770o.append(AbstractC2418i.f9087i6, 7);
            f8770o.append(AbstractC2418i.f9119m6, 8);
            f8770o.append(AbstractC2418i.f9111l6, 9);
            f8770o.append(AbstractC2418i.f9103k6, 10);
        }

        /* JADX INFO: renamed from: a */
        public void m10432a(c cVar) {
            this.f8771a = cVar.f8771a;
            this.f8772b = cVar.f8772b;
            this.f8774d = cVar.f8774d;
            this.f8775e = cVar.f8775e;
            this.f8776f = cVar.f8776f;
            this.f8779i = cVar.f8779i;
            this.f8777g = cVar.f8777g;
            this.f8778h = cVar.f8778h;
        }

        /* JADX INFO: renamed from: b */
        void m10433b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2418i.f9047d6);
            this.f8771a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                switch (f8770o.get(index)) {
                    case 1:
                        this.f8779i = typedArrayObtainStyledAttributes.getFloat(index, this.f8779i);
                        break;
                    case 2:
                        this.f8775e = typedArrayObtainStyledAttributes.getInt(index, this.f8775e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f8774d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f8774d = C7198a.f28707c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f8776f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f8772b = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8772b);
                        break;
                    case 6:
                        this.f8773c = typedArrayObtainStyledAttributes.getInteger(index, this.f8773c);
                        break;
                    case 7:
                        this.f8777g = typedArrayObtainStyledAttributes.getFloat(index, this.f8777g);
                        break;
                    case 8:
                        this.f8781k = typedArrayObtainStyledAttributes.getInteger(index, this.f8781k);
                        break;
                    case 9:
                        this.f8780j = typedArrayObtainStyledAttributes.getFloat(index, this.f8780j);
                        break;
                    case 10:
                        int i8 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i8 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f8784n = resourceId;
                            if (resourceId != -1) {
                                this.f8783m = -2;
                            }
                        } else if (i8 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f8782l = string;
                            if (string.indexOf("/") > 0) {
                                this.f8784n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f8783m = -2;
                            } else {
                                this.f8783m = -1;
                            }
                        } else {
                            this.f8783m = typedArrayObtainStyledAttributes.getInteger(index, this.f8784n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public boolean f8785a = false;

        /* JADX INFO: renamed from: b */
        public int f8786b = 0;

        /* JADX INFO: renamed from: c */
        public int f8787c = 0;

        /* JADX INFO: renamed from: d */
        public float f8788d = 1.0f;

        /* JADX INFO: renamed from: e */
        public float f8789e = Float.NaN;

        /* JADX INFO: renamed from: a */
        public void m10434a(d dVar) {
            this.f8785a = dVar.f8785a;
            this.f8786b = dVar.f8786b;
            this.f8788d = dVar.f8788d;
            this.f8789e = dVar.f8789e;
            this.f8787c = dVar.f8787c;
        }

        /* JADX INFO: renamed from: b */
        void m10435b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2418i.f9199w6);
            this.f8785a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == AbstractC2418i.f9215y6) {
                    this.f8788d = typedArrayObtainStyledAttributes.getFloat(index, this.f8788d);
                } else if (index == AbstractC2418i.f9207x6) {
                    this.f8786b = typedArrayObtainStyledAttributes.getInt(index, this.f8786b);
                    this.f8786b = C2414e.f8671g[this.f8786b];
                } else if (index == AbstractC2418i.f8813A6) {
                    this.f8787c = typedArrayObtainStyledAttributes.getInt(index, this.f8787c);
                } else if (index == AbstractC2418i.f9223z6) {
                    this.f8789e = typedArrayObtainStyledAttributes.getFloat(index, this.f8789e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$e */
    public static class e {

        /* JADX INFO: renamed from: o */
        private static SparseIntArray f8790o;

        /* JADX INFO: renamed from: a */
        public boolean f8791a = false;

        /* JADX INFO: renamed from: b */
        public float f8792b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f8793c = 0.0f;

        /* JADX INFO: renamed from: d */
        public float f8794d = 0.0f;

        /* JADX INFO: renamed from: e */
        public float f8795e = 1.0f;

        /* JADX INFO: renamed from: f */
        public float f8796f = 1.0f;

        /* JADX INFO: renamed from: g */
        public float f8797g = Float.NaN;

        /* JADX INFO: renamed from: h */
        public float f8798h = Float.NaN;

        /* JADX INFO: renamed from: i */
        public int f8799i = -1;

        /* JADX INFO: renamed from: j */
        public float f8800j = 0.0f;

        /* JADX INFO: renamed from: k */
        public float f8801k = 0.0f;

        /* JADX INFO: renamed from: l */
        public float f8802l = 0.0f;

        /* JADX INFO: renamed from: m */
        public boolean f8803m = false;

        /* JADX INFO: renamed from: n */
        public float f8804n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8790o = sparseIntArray;
            sparseIntArray.append(AbstractC2418i.f8917N6, 1);
            f8790o.append(AbstractC2418i.f8925O6, 2);
            f8790o.append(AbstractC2418i.f8933P6, 3);
            f8790o.append(AbstractC2418i.f8901L6, 4);
            f8790o.append(AbstractC2418i.f8909M6, 5);
            f8790o.append(AbstractC2418i.f8869H6, 6);
            f8790o.append(AbstractC2418i.f8877I6, 7);
            f8790o.append(AbstractC2418i.f8885J6, 8);
            f8790o.append(AbstractC2418i.f8893K6, 9);
            f8790o.append(AbstractC2418i.f8941Q6, 10);
            f8790o.append(AbstractC2418i.f8949R6, 11);
            f8790o.append(AbstractC2418i.f8957S6, 12);
        }

        /* JADX INFO: renamed from: a */
        public void m10436a(e eVar) {
            this.f8791a = eVar.f8791a;
            this.f8792b = eVar.f8792b;
            this.f8793c = eVar.f8793c;
            this.f8794d = eVar.f8794d;
            this.f8795e = eVar.f8795e;
            this.f8796f = eVar.f8796f;
            this.f8797g = eVar.f8797g;
            this.f8798h = eVar.f8798h;
            this.f8799i = eVar.f8799i;
            this.f8800j = eVar.f8800j;
            this.f8801k = eVar.f8801k;
            this.f8802l = eVar.f8802l;
            this.f8803m = eVar.f8803m;
            this.f8804n = eVar.f8804n;
        }

        /* JADX INFO: renamed from: b */
        void m10437b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2418i.f8861G6);
            this.f8791a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                switch (f8790o.get(index)) {
                    case 1:
                        this.f8792b = typedArrayObtainStyledAttributes.getFloat(index, this.f8792b);
                        break;
                    case 2:
                        this.f8793c = typedArrayObtainStyledAttributes.getFloat(index, this.f8793c);
                        break;
                    case 3:
                        this.f8794d = typedArrayObtainStyledAttributes.getFloat(index, this.f8794d);
                        break;
                    case 4:
                        this.f8795e = typedArrayObtainStyledAttributes.getFloat(index, this.f8795e);
                        break;
                    case 5:
                        this.f8796f = typedArrayObtainStyledAttributes.getFloat(index, this.f8796f);
                        break;
                    case 6:
                        this.f8797g = typedArrayObtainStyledAttributes.getDimension(index, this.f8797g);
                        break;
                    case 7:
                        this.f8798h = typedArrayObtainStyledAttributes.getDimension(index, this.f8798h);
                        break;
                    case 8:
                        this.f8800j = typedArrayObtainStyledAttributes.getDimension(index, this.f8800j);
                        break;
                    case 9:
                        this.f8801k = typedArrayObtainStyledAttributes.getDimension(index, this.f8801k);
                        break;
                    case 10:
                        this.f8802l = typedArrayObtainStyledAttributes.getDimension(index, this.f8802l);
                        break;
                    case 11:
                        this.f8803m = true;
                        this.f8804n = typedArrayObtainStyledAttributes.getDimension(index, this.f8804n);
                        break;
                    case 12:
                        this.f8799i = C2414e.m10409m(typedArrayObtainStyledAttributes, index, this.f8799i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f8672h.append(AbstractC2418i.f9081i0, 25);
        f8672h.append(AbstractC2418i.f9089j0, 26);
        f8672h.append(AbstractC2418i.f9105l0, 29);
        f8672h.append(AbstractC2418i.f9113m0, 30);
        f8672h.append(AbstractC2418i.f9161s0, 36);
        f8672h.append(AbstractC2418i.f9153r0, 35);
        f8672h.append(AbstractC2418i.f8926P, 4);
        f8672h.append(AbstractC2418i.f8918O, 3);
        f8672h.append(AbstractC2418i.f8886K, 1);
        f8672h.append(AbstractC2418i.f8902M, 91);
        f8672h.append(AbstractC2418i.f8894L, 92);
        f8672h.append(AbstractC2418i.f8815B0, 6);
        f8672h.append(AbstractC2418i.f8823C0, 7);
        f8672h.append(AbstractC2418i.f8982W, 17);
        f8672h.append(AbstractC2418i.f8990X, 18);
        f8672h.append(AbstractC2418i.f8998Y, 19);
        f8672h.append(AbstractC2418i.f8854G, 99);
        f8672h.append(AbstractC2418i.f9032c, 27);
        f8672h.append(AbstractC2418i.f9121n0, 32);
        f8672h.append(AbstractC2418i.f9129o0, 33);
        f8672h.append(AbstractC2418i.f8974V, 10);
        f8672h.append(AbstractC2418i.f8966U, 9);
        f8672h.append(AbstractC2418i.f8847F0, 13);
        f8672h.append(AbstractC2418i.f8871I0, 16);
        f8672h.append(AbstractC2418i.f8855G0, 14);
        f8672h.append(AbstractC2418i.f8831D0, 11);
        f8672h.append(AbstractC2418i.f8863H0, 15);
        f8672h.append(AbstractC2418i.f8839E0, 12);
        f8672h.append(AbstractC2418i.f9185v0, 40);
        f8672h.append(AbstractC2418i.f9065g0, 39);
        f8672h.append(AbstractC2418i.f9057f0, 41);
        f8672h.append(AbstractC2418i.f9177u0, 42);
        f8672h.append(AbstractC2418i.f9049e0, 20);
        f8672h.append(AbstractC2418i.f9169t0, 37);
        f8672h.append(AbstractC2418i.f8958T, 5);
        f8672h.append(AbstractC2418i.f9073h0, 87);
        f8672h.append(AbstractC2418i.f9145q0, 87);
        f8672h.append(AbstractC2418i.f9097k0, 87);
        f8672h.append(AbstractC2418i.f8910N, 87);
        f8672h.append(AbstractC2418i.f8878J, 87);
        f8672h.append(AbstractC2418i.f9072h, 24);
        f8672h.append(AbstractC2418i.f9088j, 28);
        f8672h.append(AbstractC2418i.f9184v, 31);
        f8672h.append(AbstractC2418i.f9192w, 8);
        f8672h.append(AbstractC2418i.f9080i, 34);
        f8672h.append(AbstractC2418i.f9096k, 2);
        f8672h.append(AbstractC2418i.f9056f, 23);
        f8672h.append(AbstractC2418i.f9064g, 21);
        f8672h.append(AbstractC2418i.f9193w0, 95);
        f8672h.append(AbstractC2418i.f9006Z, 96);
        f8672h.append(AbstractC2418i.f9048e, 22);
        f8672h.append(AbstractC2418i.f9104l, 43);
        f8672h.append(AbstractC2418i.f9208y, 44);
        f8672h.append(AbstractC2418i.f9168t, 45);
        f8672h.append(AbstractC2418i.f9176u, 46);
        f8672h.append(AbstractC2418i.f9160s, 60);
        f8672h.append(AbstractC2418i.f9144q, 47);
        f8672h.append(AbstractC2418i.f9152r, 48);
        f8672h.append(AbstractC2418i.f9112m, 49);
        f8672h.append(AbstractC2418i.f9120n, 50);
        f8672h.append(AbstractC2418i.f9128o, 51);
        f8672h.append(AbstractC2418i.f9136p, 52);
        f8672h.append(AbstractC2418i.f9200x, 53);
        f8672h.append(AbstractC2418i.f9201x0, 54);
        f8672h.append(AbstractC2418i.f9015a0, 55);
        f8672h.append(AbstractC2418i.f9209y0, 56);
        f8672h.append(AbstractC2418i.f9024b0, 57);
        f8672h.append(AbstractC2418i.f9217z0, 58);
        f8672h.append(AbstractC2418i.f9033c0, 59);
        f8672h.append(AbstractC2418i.f8934Q, 61);
        f8672h.append(AbstractC2418i.f8950S, 62);
        f8672h.append(AbstractC2418i.f8942R, 63);
        f8672h.append(AbstractC2418i.f9216z, 64);
        f8672h.append(AbstractC2418i.f8951S0, 65);
        f8672h.append(AbstractC2418i.f8846F, 66);
        f8672h.append(AbstractC2418i.f8959T0, 67);
        f8672h.append(AbstractC2418i.f8895L0, 79);
        f8672h.append(AbstractC2418i.f9040d, 38);
        f8672h.append(AbstractC2418i.f8887K0, 68);
        f8672h.append(AbstractC2418i.f8807A0, 69);
        f8672h.append(AbstractC2418i.f9041d0, 70);
        f8672h.append(AbstractC2418i.f8879J0, 97);
        f8672h.append(AbstractC2418i.f8830D, 71);
        f8672h.append(AbstractC2418i.f8814B, 72);
        f8672h.append(AbstractC2418i.f8822C, 73);
        f8672h.append(AbstractC2418i.f8838E, 74);
        f8672h.append(AbstractC2418i.f8806A, 75);
        f8672h.append(AbstractC2418i.f8903M0, 76);
        f8672h.append(AbstractC2418i.f9137p0, 77);
        f8672h.append(AbstractC2418i.f8967U0, 78);
        f8672h.append(AbstractC2418i.f8870I, 80);
        f8672h.append(AbstractC2418i.f8862H, 81);
        f8672h.append(AbstractC2418i.f8911N0, 82);
        f8672h.append(AbstractC2418i.f8943R0, 83);
        f8672h.append(AbstractC2418i.f8935Q0, 84);
        f8672h.append(AbstractC2418i.f8927P0, 85);
        f8672h.append(AbstractC2418i.f8919O0, 86);
        SparseIntArray sparseIntArray = f8673i;
        int i7 = AbstractC2418i.f9002Y3;
        sparseIntArray.append(i7, 6);
        f8673i.append(i7, 7);
        f8673i.append(AbstractC2418i.f8961T2, 27);
        f8673i.append(AbstractC2418i.f9028b4, 13);
        f8673i.append(AbstractC2418i.f9053e4, 16);
        f8673i.append(AbstractC2418i.f9037c4, 14);
        f8673i.append(AbstractC2418i.f9010Z3, 11);
        f8673i.append(AbstractC2418i.f9045d4, 15);
        f8673i.append(AbstractC2418i.f9019a4, 12);
        f8673i.append(AbstractC2418i.f8954S3, 40);
        f8673i.append(AbstractC2418i.f8898L3, 39);
        f8673i.append(AbstractC2418i.f8890K3, 41);
        f8673i.append(AbstractC2418i.f8946R3, 42);
        f8673i.append(AbstractC2418i.f8882J3, 20);
        f8673i.append(AbstractC2418i.f8938Q3, 37);
        f8673i.append(AbstractC2418i.f8834D3, 5);
        f8673i.append(AbstractC2418i.f8906M3, 87);
        f8673i.append(AbstractC2418i.f8930P3, 87);
        f8673i.append(AbstractC2418i.f8914N3, 87);
        f8673i.append(AbstractC2418i.f8810A3, 87);
        f8673i.append(AbstractC2418i.f9220z3, 87);
        f8673i.append(AbstractC2418i.f9001Y2, 24);
        f8673i.append(AbstractC2418i.f9018a3, 28);
        f8673i.append(AbstractC2418i.f9116m3, 31);
        f8673i.append(AbstractC2418i.f9124n3, 8);
        f8673i.append(AbstractC2418i.f9009Z2, 34);
        f8673i.append(AbstractC2418i.f9027b3, 2);
        f8673i.append(AbstractC2418i.f8985W2, 23);
        f8673i.append(AbstractC2418i.f8993X2, 21);
        f8673i.append(AbstractC2418i.f8962T3, 95);
        f8673i.append(AbstractC2418i.f8842E3, 96);
        f8673i.append(AbstractC2418i.f8977V2, 22);
        f8673i.append(AbstractC2418i.f9036c3, 43);
        f8673i.append(AbstractC2418i.f9140p3, 44);
        f8673i.append(AbstractC2418i.f9100k3, 45);
        f8673i.append(AbstractC2418i.f9108l3, 46);
        f8673i.append(AbstractC2418i.f9092j3, 60);
        f8673i.append(AbstractC2418i.f9076h3, 47);
        f8673i.append(AbstractC2418i.f9084i3, 48);
        f8673i.append(AbstractC2418i.f9044d3, 49);
        f8673i.append(AbstractC2418i.f9052e3, 50);
        f8673i.append(AbstractC2418i.f9060f3, 51);
        f8673i.append(AbstractC2418i.f9068g3, 52);
        f8673i.append(AbstractC2418i.f9132o3, 53);
        f8673i.append(AbstractC2418i.f8970U3, 54);
        f8673i.append(AbstractC2418i.f8850F3, 55);
        f8673i.append(AbstractC2418i.f8978V3, 56);
        f8673i.append(AbstractC2418i.f8858G3, 57);
        f8673i.append(AbstractC2418i.f8986W3, 58);
        f8673i.append(AbstractC2418i.f8866H3, 59);
        f8673i.append(AbstractC2418i.f8826C3, 62);
        f8673i.append(AbstractC2418i.f8818B3, 63);
        f8673i.append(AbstractC2418i.f9148q3, 64);
        f8673i.append(AbstractC2418i.f9141p4, 65);
        f8673i.append(AbstractC2418i.f9196w3, 66);
        f8673i.append(AbstractC2418i.f9149q4, 67);
        f8673i.append(AbstractC2418i.f9077h4, 79);
        f8673i.append(AbstractC2418i.f8969U2, 38);
        f8673i.append(AbstractC2418i.f9085i4, 98);
        f8673i.append(AbstractC2418i.f9069g4, 68);
        f8673i.append(AbstractC2418i.f8994X3, 69);
        f8673i.append(AbstractC2418i.f8874I3, 70);
        f8673i.append(AbstractC2418i.f9180u3, 71);
        f8673i.append(AbstractC2418i.f9164s3, 72);
        f8673i.append(AbstractC2418i.f9172t3, 73);
        f8673i.append(AbstractC2418i.f9188v3, 74);
        f8673i.append(AbstractC2418i.f9156r3, 75);
        f8673i.append(AbstractC2418i.f9093j4, 76);
        f8673i.append(AbstractC2418i.f8922O3, 77);
        f8673i.append(AbstractC2418i.f9157r4, 78);
        f8673i.append(AbstractC2418i.f9212y3, 80);
        f8673i.append(AbstractC2418i.f9204x3, 81);
        f8673i.append(AbstractC2418i.f9101k4, 82);
        f8673i.append(AbstractC2418i.f9133o4, 83);
        f8673i.append(AbstractC2418i.f9125n4, 84);
        f8673i.append(AbstractC2418i.f9117m4, 85);
        f8673i.append(AbstractC2418i.f9109l4, 86);
        f8673i.append(AbstractC2418i.f9061f4, 97);
    }

    /* JADX INFO: renamed from: h */
    private int[] m10406h(View view, String str) {
        int iIntValue;
        Object objM10368i;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i7 = 0;
        int i8 = 0;
        while (i7 < strArrSplit.length) {
            String strTrim = strArrSplit[i7].trim();
            try {
                iIntValue = AbstractC2417h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objM10368i = ((ConstraintLayout) view.getParent()).m10368i(0, strTrim)) != null && (objM10368i instanceof Integer)) {
                iIntValue = ((Integer) objM10368i).intValue();
            }
            iArr[i8] = iIntValue;
            i7++;
            i8++;
        }
        return i8 != strArrSplit.length ? Arrays.copyOf(iArr, i8) : iArr;
    }

    /* JADX INFO: renamed from: i */
    private a m10407i(Context context, AttributeSet attributeSet, boolean z7) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z7 ? AbstractC2418i.f8953S2 : AbstractC2418i.f9023b);
        m10413q(aVar, typedArrayObtainStyledAttributes, z7);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: renamed from: j */
    private a m10408j(int i7) {
        if (!this.f8679f.containsKey(Integer.valueOf(i7))) {
            this.f8679f.put(Integer.valueOf(i7), new a());
        }
        return (a) this.f8679f.get(Integer.valueOf(i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static int m10409m(TypedArray typedArray, int i7, int i8) {
        int resourceId = typedArray.getResourceId(i7, i8);
        return resourceId == -1 ? typedArray.getInt(i7, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x0058  */
    /* JADX WARN: Code duplicated, block: B:39:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    static void m10410n(Object obj, TypedArray typedArray, int i7, int i8) {
        int dimensionPixelSize;
        boolean z7;
        a.C7662a c7662a;
        b bVar;
        ConstraintLayout.C2408b c2408b;
        if (obj == null) {
            return;
        }
        int i9 = typedArray.peekValue(i7).type;
        if (i9 == 3) {
            m10411o(obj, typedArray.getString(i7), i8);
            return;
        }
        int i10 = 0;
        if (i9 != 5) {
            dimensionPixelSize = typedArray.getInt(i7, 0);
            if (dimensionPixelSize == -4) {
                z7 = true;
                i10 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z7 = false;
            }
            if (obj instanceof ConstraintLayout.C2408b) {
                c2408b = (ConstraintLayout.C2408b) obj;
                if (i8 == 0) {
                    ((ViewGroup.MarginLayoutParams) c2408b).width = i10;
                    c2408b.f8570a0 = z7;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c2408b).height = i10;
                    c2408b.f8572b0 = z7;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i8 == 0) {
                    bVar.f8733d = i10;
                    bVar.f8754n0 = z7;
                    return;
                } else {
                    bVar.f8735e = i10;
                    bVar.f8756o0 = z7;
                    return;
                }
            }
            if (obj instanceof a.C7662a) {
                c7662a = (a.C7662a) obj;
                if (i8 == 0) {
                    c7662a.m10427b(23, i10);
                    c7662a.m10429d(80, z7);
                } else {
                    c7662a.m10427b(21, i10);
                    c7662a.m10429d(81, z7);
                }
            }
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i7, 0);
        i10 = dimensionPixelSize;
        z7 = false;
        if (obj instanceof ConstraintLayout.C2408b) {
            c2408b = (ConstraintLayout.C2408b) obj;
            if (i8 == 0) {
                ((ViewGroup.MarginLayoutParams) c2408b).width = i10;
                c2408b.f8570a0 = z7;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) c2408b).height = i10;
                c2408b.f8572b0 = z7;
                return;
            }
        }
        if (obj instanceof b) {
            bVar = (b) obj;
            if (i8 == 0) {
                bVar.f8733d = i10;
                bVar.f8754n0 = z7;
                return;
            } else {
                bVar.f8735e = i10;
                bVar.f8756o0 = z7;
                return;
            }
        }
        if (obj instanceof a.C7662a) {
            c7662a = (a.C7662a) obj;
            if (i8 == 0) {
                c7662a.m10427b(23, i10);
                c7662a.m10429d(80, z7);
            } else {
                c7662a.m10427b(21, i10);
                c7662a.m10429d(81, z7);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    static void m10411o(Object obj, String str, int i7) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.C2408b) {
                    ConstraintLayout.C2408b c2408b = (ConstraintLayout.C2408b) obj;
                    if (i7 == 0) {
                        ((ViewGroup.MarginLayoutParams) c2408b).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c2408b).height = 0;
                    }
                    m10412p(c2408b, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f8701A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C7662a) {
                        ((a.C7662a) obj).m10428c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f7 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.C2408b) {
                        ConstraintLayout.C2408b c2408b2 = (ConstraintLayout.C2408b) obj;
                        if (i7 == 0) {
                            ((ViewGroup.MarginLayoutParams) c2408b2).width = 0;
                            c2408b2.f8554L = f7;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c2408b2).height = 0;
                            c2408b2.f8555M = f7;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (i7 == 0) {
                            bVar.f8733d = 0;
                            bVar.f8723W = f7;
                            return;
                        } else {
                            bVar.f8735e = 0;
                            bVar.f8722V = f7;
                            return;
                        }
                    }
                    if (obj instanceof a.C7662a) {
                        a.C7662a c7662a = (a.C7662a) obj;
                        if (i7 == 0) {
                            c7662a.m10427b(23, 0);
                            c7662a.m10426a(39, f7);
                            return;
                        } else {
                            c7662a.m10427b(21, 0);
                            c7662a.m10426a(40, f7);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.C2408b) {
                        ConstraintLayout.C2408b c2408b3 = (ConstraintLayout.C2408b) obj;
                        if (i7 == 0) {
                            ((ViewGroup.MarginLayoutParams) c2408b3).width = 0;
                            c2408b3.f8564V = fMax;
                            c2408b3.f8558P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c2408b3).height = 0;
                            c2408b3.f8565W = fMax;
                            c2408b3.f8559Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar2 = (b) obj;
                        if (i7 == 0) {
                            bVar2.f8733d = 0;
                            bVar2.f8738f0 = fMax;
                            bVar2.f8726Z = 2;
                            return;
                        } else {
                            bVar2.f8735e = 0;
                            bVar2.f8740g0 = fMax;
                            bVar2.f8728a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C7662a) {
                        a.C7662a c7662a2 = (a.C7662a) obj;
                        if (i7 == 0) {
                            c7662a2.m10427b(23, 0);
                            c7662a2.m10427b(54, 2);
                        } else {
                            c7662a2.m10427b(21, 0);
                            c7662a2.m10427b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: p */
    static void m10412p(ConstraintLayout.C2408b c2408b, String str) {
        float fAbs = Float.NaN;
        int i7 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i8 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i7 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i7 = 1;
                }
                i8 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i8);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i8, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f7 = Float.parseFloat(strSubstring3);
                        float f8 = Float.parseFloat(strSubstring4);
                        if (f7 > 0.0f && f8 > 0.0f) {
                            fAbs = i7 == 1 ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c2408b.f8551I = str;
        c2408b.f8552J = fAbs;
        c2408b.f8553K = i7;
    }

    /* JADX INFO: renamed from: q */
    private void m10413q(a aVar, TypedArray typedArray, boolean z7) {
        if (z7) {
            m10414r(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArray.getIndex(i7);
            if (index != AbstractC2418i.f9040d && AbstractC2418i.f9184v != index && AbstractC2418i.f9192w != index) {
                aVar.f8683d.f8771a = true;
                aVar.f8684e.f8729b = true;
                aVar.f8682c.f8785a = true;
                aVar.f8685f.f8791a = true;
            }
            switch (f8672h.get(index)) {
                case 1:
                    b bVar = aVar.f8684e;
                    bVar.f8761r = m10409m(typedArray, index, bVar.f8761r);
                    break;
                case 2:
                    b bVar2 = aVar.f8684e;
                    bVar2.f8711K = typedArray.getDimensionPixelSize(index, bVar2.f8711K);
                    break;
                case 3:
                    b bVar3 = aVar.f8684e;
                    bVar3.f8759q = m10409m(typedArray, index, bVar3.f8759q);
                    break;
                case 4:
                    b bVar4 = aVar.f8684e;
                    bVar4.f8757p = m10409m(typedArray, index, bVar4.f8757p);
                    break;
                case 5:
                    aVar.f8684e.f8701A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f8684e;
                    bVar5.f8705E = typedArray.getDimensionPixelOffset(index, bVar5.f8705E);
                    break;
                case 7:
                    b bVar6 = aVar.f8684e;
                    bVar6.f8706F = typedArray.getDimensionPixelOffset(index, bVar6.f8706F);
                    break;
                case 8:
                    b bVar7 = aVar.f8684e;
                    bVar7.f8712L = typedArray.getDimensionPixelSize(index, bVar7.f8712L);
                    break;
                case 9:
                    b bVar8 = aVar.f8684e;
                    bVar8.f8767x = m10409m(typedArray, index, bVar8.f8767x);
                    break;
                case 10:
                    b bVar9 = aVar.f8684e;
                    bVar9.f8766w = m10409m(typedArray, index, bVar9.f8766w);
                    break;
                case 11:
                    b bVar10 = aVar.f8684e;
                    bVar10.f8718R = typedArray.getDimensionPixelSize(index, bVar10.f8718R);
                    break;
                case 12:
                    b bVar11 = aVar.f8684e;
                    bVar11.f8719S = typedArray.getDimensionPixelSize(index, bVar11.f8719S);
                    break;
                case 13:
                    b bVar12 = aVar.f8684e;
                    bVar12.f8715O = typedArray.getDimensionPixelSize(index, bVar12.f8715O);
                    break;
                case 14:
                    b bVar13 = aVar.f8684e;
                    bVar13.f8717Q = typedArray.getDimensionPixelSize(index, bVar13.f8717Q);
                    break;
                case 15:
                    b bVar14 = aVar.f8684e;
                    bVar14.f8720T = typedArray.getDimensionPixelSize(index, bVar14.f8720T);
                    break;
                case 16:
                    b bVar15 = aVar.f8684e;
                    bVar15.f8716P = typedArray.getDimensionPixelSize(index, bVar15.f8716P);
                    break;
                case 17:
                    b bVar16 = aVar.f8684e;
                    bVar16.f8737f = typedArray.getDimensionPixelOffset(index, bVar16.f8737f);
                    break;
                case 18:
                    b bVar17 = aVar.f8684e;
                    bVar17.f8739g = typedArray.getDimensionPixelOffset(index, bVar17.f8739g);
                    break;
                case 19:
                    b bVar18 = aVar.f8684e;
                    bVar18.f8741h = typedArray.getFloat(index, bVar18.f8741h);
                    break;
                case 20:
                    b bVar19 = aVar.f8684e;
                    bVar19.f8768y = typedArray.getFloat(index, bVar19.f8768y);
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    b bVar20 = aVar.f8684e;
                    bVar20.f8735e = typedArray.getLayoutDimension(index, bVar20.f8735e);
                    break;
                case 22:
                    d dVar = aVar.f8682c;
                    dVar.f8786b = typedArray.getInt(index, dVar.f8786b);
                    d dVar2 = aVar.f8682c;
                    dVar2.f8786b = f8671g[dVar2.f8786b];
                    break;
                case 23:
                    b bVar21 = aVar.f8684e;
                    bVar21.f8733d = typedArray.getLayoutDimension(index, bVar21.f8733d);
                    break;
                case 24:
                    b bVar22 = aVar.f8684e;
                    bVar22.f8708H = typedArray.getDimensionPixelSize(index, bVar22.f8708H);
                    break;
                case 25:
                    b bVar23 = aVar.f8684e;
                    bVar23.f8745j = m10409m(typedArray, index, bVar23.f8745j);
                    break;
                case 26:
                    b bVar24 = aVar.f8684e;
                    bVar24.f8747k = m10409m(typedArray, index, bVar24.f8747k);
                    break;
                case 27:
                    b bVar25 = aVar.f8684e;
                    bVar25.f8707G = typedArray.getInt(index, bVar25.f8707G);
                    break;
                case 28:
                    b bVar26 = aVar.f8684e;
                    bVar26.f8709I = typedArray.getDimensionPixelSize(index, bVar26.f8709I);
                    break;
                case 29:
                    b bVar27 = aVar.f8684e;
                    bVar27.f8749l = m10409m(typedArray, index, bVar27.f8749l);
                    break;
                case 30:
                    b bVar28 = aVar.f8684e;
                    bVar28.f8751m = m10409m(typedArray, index, bVar28.f8751m);
                    break;
                case 31:
                    b bVar29 = aVar.f8684e;
                    bVar29.f8713M = typedArray.getDimensionPixelSize(index, bVar29.f8713M);
                    break;
                case 32:
                    b bVar30 = aVar.f8684e;
                    bVar30.f8764u = m10409m(typedArray, index, bVar30.f8764u);
                    break;
                case 33:
                    b bVar31 = aVar.f8684e;
                    bVar31.f8765v = m10409m(typedArray, index, bVar31.f8765v);
                    break;
                case 34:
                    b bVar32 = aVar.f8684e;
                    bVar32.f8710J = typedArray.getDimensionPixelSize(index, bVar32.f8710J);
                    break;
                case 35:
                    b bVar33 = aVar.f8684e;
                    bVar33.f8755o = m10409m(typedArray, index, bVar33.f8755o);
                    break;
                case 36:
                    b bVar34 = aVar.f8684e;
                    bVar34.f8753n = m10409m(typedArray, index, bVar34.f8753n);
                    break;
                case 37:
                    b bVar35 = aVar.f8684e;
                    bVar35.f8769z = typedArray.getFloat(index, bVar35.f8769z);
                    break;
                case 38:
                    aVar.f8680a = typedArray.getResourceId(index, aVar.f8680a);
                    break;
                case 39:
                    b bVar36 = aVar.f8684e;
                    bVar36.f8723W = typedArray.getFloat(index, bVar36.f8723W);
                    break;
                case 40:
                    b bVar37 = aVar.f8684e;
                    bVar37.f8722V = typedArray.getFloat(index, bVar37.f8722V);
                    break;
                case 41:
                    b bVar38 = aVar.f8684e;
                    bVar38.f8724X = typedArray.getInt(index, bVar38.f8724X);
                    break;
                case 42:
                    b bVar39 = aVar.f8684e;
                    bVar39.f8725Y = typedArray.getInt(index, bVar39.f8725Y);
                    break;
                case 43:
                    d dVar3 = aVar.f8682c;
                    dVar3.f8788d = typedArray.getFloat(index, dVar3.f8788d);
                    break;
                case 44:
                    e eVar = aVar.f8685f;
                    eVar.f8803m = true;
                    eVar.f8804n = typedArray.getDimension(index, eVar.f8804n);
                    break;
                case 45:
                    e eVar2 = aVar.f8685f;
                    eVar2.f8793c = typedArray.getFloat(index, eVar2.f8793c);
                    break;
                case 46:
                    e eVar3 = aVar.f8685f;
                    eVar3.f8794d = typedArray.getFloat(index, eVar3.f8794d);
                    break;
                case 47:
                    e eVar4 = aVar.f8685f;
                    eVar4.f8795e = typedArray.getFloat(index, eVar4.f8795e);
                    break;
                case 48:
                    e eVar5 = aVar.f8685f;
                    eVar5.f8796f = typedArray.getFloat(index, eVar5.f8796f);
                    break;
                case 49:
                    e eVar6 = aVar.f8685f;
                    eVar6.f8797g = typedArray.getDimension(index, eVar6.f8797g);
                    break;
                case 50:
                    e eVar7 = aVar.f8685f;
                    eVar7.f8798h = typedArray.getDimension(index, eVar7.f8798h);
                    break;
                case 51:
                    e eVar8 = aVar.f8685f;
                    eVar8.f8800j = typedArray.getDimension(index, eVar8.f8800j);
                    break;
                case 52:
                    e eVar9 = aVar.f8685f;
                    eVar9.f8801k = typedArray.getDimension(index, eVar9.f8801k);
                    break;
                case 53:
                    e eVar10 = aVar.f8685f;
                    eVar10.f8802l = typedArray.getDimension(index, eVar10.f8802l);
                    break;
                case 54:
                    b bVar40 = aVar.f8684e;
                    bVar40.f8726Z = typedArray.getInt(index, bVar40.f8726Z);
                    break;
                case 55:
                    b bVar41 = aVar.f8684e;
                    bVar41.f8728a0 = typedArray.getInt(index, bVar41.f8728a0);
                    break;
                case 56:
                    b bVar42 = aVar.f8684e;
                    bVar42.f8730b0 = typedArray.getDimensionPixelSize(index, bVar42.f8730b0);
                    break;
                case 57:
                    b bVar43 = aVar.f8684e;
                    bVar43.f8732c0 = typedArray.getDimensionPixelSize(index, bVar43.f8732c0);
                    break;
                case 58:
                    b bVar44 = aVar.f8684e;
                    bVar44.f8734d0 = typedArray.getDimensionPixelSize(index, bVar44.f8734d0);
                    break;
                case 59:
                    b bVar45 = aVar.f8684e;
                    bVar45.f8736e0 = typedArray.getDimensionPixelSize(index, bVar45.f8736e0);
                    break;
                case 60:
                    e eVar11 = aVar.f8685f;
                    eVar11.f8792b = typedArray.getFloat(index, eVar11.f8792b);
                    break;
                case 61:
                    b bVar46 = aVar.f8684e;
                    bVar46.f8702B = m10409m(typedArray, index, bVar46.f8702B);
                    break;
                case 62:
                    b bVar47 = aVar.f8684e;
                    bVar47.f8703C = typedArray.getDimensionPixelSize(index, bVar47.f8703C);
                    break;
                case 63:
                    b bVar48 = aVar.f8684e;
                    bVar48.f8704D = typedArray.getFloat(index, bVar48.f8704D);
                    break;
                case 64:
                    c cVar = aVar.f8683d;
                    cVar.f8772b = m10409m(typedArray, index, cVar.f8772b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f8683d.f8774d = typedArray.getString(index);
                    } else {
                        aVar.f8683d.f8774d = C7198a.f28707c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f8683d.f8776f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f8683d;
                    cVar2.f8779i = typedArray.getFloat(index, cVar2.f8779i);
                    break;
                case 68:
                    d dVar4 = aVar.f8682c;
                    dVar4.f8789e = typedArray.getFloat(index, dVar4.f8789e);
                    break;
                case 69:
                    aVar.f8684e.f8738f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f8684e.f8740g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f8684e;
                    bVar49.f8742h0 = typedArray.getInt(index, bVar49.f8742h0);
                    break;
                case 73:
                    b bVar50 = aVar.f8684e;
                    bVar50.f8744i0 = typedArray.getDimensionPixelSize(index, bVar50.f8744i0);
                    break;
                case 74:
                    aVar.f8684e.f8750l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f8684e;
                    bVar51.f8758p0 = typedArray.getBoolean(index, bVar51.f8758p0);
                    break;
                case 76:
                    c cVar3 = aVar.f8683d;
                    cVar3.f8775e = typedArray.getInt(index, cVar3.f8775e);
                    break;
                case 77:
                    aVar.f8684e.f8752m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f8682c;
                    dVar5.f8787c = typedArray.getInt(index, dVar5.f8787c);
                    break;
                case 79:
                    c cVar4 = aVar.f8683d;
                    cVar4.f8777g = typedArray.getFloat(index, cVar4.f8777g);
                    break;
                case 80:
                    b bVar52 = aVar.f8684e;
                    bVar52.f8754n0 = typedArray.getBoolean(index, bVar52.f8754n0);
                    break;
                case 81:
                    b bVar53 = aVar.f8684e;
                    bVar53.f8756o0 = typedArray.getBoolean(index, bVar53.f8756o0);
                    break;
                case 82:
                    c cVar5 = aVar.f8683d;
                    cVar5.f8773c = typedArray.getInteger(index, cVar5.f8773c);
                    break;
                case 83:
                    e eVar12 = aVar.f8685f;
                    eVar12.f8799i = m10409m(typedArray, index, eVar12.f8799i);
                    break;
                case 84:
                    c cVar6 = aVar.f8683d;
                    cVar6.f8781k = typedArray.getInteger(index, cVar6.f8781k);
                    break;
                case 85:
                    c cVar7 = aVar.f8683d;
                    cVar7.f8780j = typedArray.getFloat(index, cVar7.f8780j);
                    break;
                case 86:
                    int i8 = typedArray.peekValue(index).type;
                    if (i8 == 1) {
                        aVar.f8683d.f8784n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f8683d;
                        if (cVar8.f8784n != -1) {
                            cVar8.f8783m = -2;
                        }
                    } else if (i8 == 3) {
                        aVar.f8683d.f8782l = typedArray.getString(index);
                        if (aVar.f8683d.f8782l.indexOf("/") > 0) {
                            aVar.f8683d.f8784n = typedArray.getResourceId(index, -1);
                            aVar.f8683d.f8783m = -2;
                        } else {
                            aVar.f8683d.f8783m = -1;
                        }
                    } else {
                        c cVar9 = aVar.f8683d;
                        cVar9.f8783m = typedArray.getInteger(index, cVar9.f8784n);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8672h.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8672h.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f8684e;
                    bVar54.f8762s = m10409m(typedArray, index, bVar54.f8762s);
                    break;
                case 92:
                    b bVar55 = aVar.f8684e;
                    bVar55.f8763t = m10409m(typedArray, index, bVar55.f8763t);
                    break;
                case 93:
                    b bVar56 = aVar.f8684e;
                    bVar56.f8714N = typedArray.getDimensionPixelSize(index, bVar56.f8714N);
                    break;
                case 94:
                    b bVar57 = aVar.f8684e;
                    bVar57.f8721U = typedArray.getDimensionPixelSize(index, bVar57.f8721U);
                    break;
                case 95:
                    m10410n(aVar.f8684e, typedArray, index, 0);
                    break;
                case 96:
                    m10410n(aVar.f8684e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f8684e;
                    bVar58.f8760q0 = typedArray.getInt(index, bVar58.f8760q0);
                    break;
            }
        }
        b bVar59 = aVar.f8684e;
        if (bVar59.f8750l0 != null) {
            bVar59.f8748k0 = null;
        }
    }

    /* JADX INFO: renamed from: r */
    private static void m10414r(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C7662a c7662a = new a.C7662a();
        aVar.f8687h = c7662a;
        aVar.f8683d.f8771a = false;
        aVar.f8684e.f8729b = false;
        aVar.f8682c.f8785a = false;
        aVar.f8685f.f8791a = false;
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArray.getIndex(i7);
            switch (f8673i.get(index)) {
                case 2:
                    c7662a.m10427b(2, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8711K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8672h.get(index));
                    break;
                case 5:
                    c7662a.m10428c(5, typedArray.getString(index));
                    break;
                case 6:
                    c7662a.m10427b(6, typedArray.getDimensionPixelOffset(index, aVar.f8684e.f8705E));
                    break;
                case 7:
                    c7662a.m10427b(7, typedArray.getDimensionPixelOffset(index, aVar.f8684e.f8706F));
                    break;
                case 8:
                    c7662a.m10427b(8, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8712L));
                    break;
                case 11:
                    c7662a.m10427b(11, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8718R));
                    break;
                case 12:
                    c7662a.m10427b(12, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8719S));
                    break;
                case 13:
                    c7662a.m10427b(13, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8715O));
                    break;
                case 14:
                    c7662a.m10427b(14, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8717Q));
                    break;
                case 15:
                    c7662a.m10427b(15, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8720T));
                    break;
                case 16:
                    c7662a.m10427b(16, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8716P));
                    break;
                case 17:
                    c7662a.m10427b(17, typedArray.getDimensionPixelOffset(index, aVar.f8684e.f8737f));
                    break;
                case 18:
                    c7662a.m10427b(18, typedArray.getDimensionPixelOffset(index, aVar.f8684e.f8739g));
                    break;
                case 19:
                    c7662a.m10426a(19, typedArray.getFloat(index, aVar.f8684e.f8741h));
                    break;
                case 20:
                    c7662a.m10426a(20, typedArray.getFloat(index, aVar.f8684e.f8768y));
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    c7662a.m10427b(21, typedArray.getLayoutDimension(index, aVar.f8684e.f8735e));
                    break;
                case 22:
                    c7662a.m10427b(22, f8671g[typedArray.getInt(index, aVar.f8682c.f8786b)]);
                    break;
                case 23:
                    c7662a.m10427b(23, typedArray.getLayoutDimension(index, aVar.f8684e.f8733d));
                    break;
                case 24:
                    c7662a.m10427b(24, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8708H));
                    break;
                case 27:
                    c7662a.m10427b(27, typedArray.getInt(index, aVar.f8684e.f8707G));
                    break;
                case 28:
                    c7662a.m10427b(28, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8709I));
                    break;
                case 31:
                    c7662a.m10427b(31, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8713M));
                    break;
                case 34:
                    c7662a.m10427b(34, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8710J));
                    break;
                case 37:
                    c7662a.m10426a(37, typedArray.getFloat(index, aVar.f8684e.f8769z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f8680a);
                    aVar.f8680a = resourceId;
                    c7662a.m10427b(38, resourceId);
                    break;
                case 39:
                    c7662a.m10426a(39, typedArray.getFloat(index, aVar.f8684e.f8723W));
                    break;
                case 40:
                    c7662a.m10426a(40, typedArray.getFloat(index, aVar.f8684e.f8722V));
                    break;
                case 41:
                    c7662a.m10427b(41, typedArray.getInt(index, aVar.f8684e.f8724X));
                    break;
                case 42:
                    c7662a.m10427b(42, typedArray.getInt(index, aVar.f8684e.f8725Y));
                    break;
                case 43:
                    c7662a.m10426a(43, typedArray.getFloat(index, aVar.f8682c.f8788d));
                    break;
                case 44:
                    c7662a.m10429d(44, true);
                    c7662a.m10426a(44, typedArray.getDimension(index, aVar.f8685f.f8804n));
                    break;
                case 45:
                    c7662a.m10426a(45, typedArray.getFloat(index, aVar.f8685f.f8793c));
                    break;
                case 46:
                    c7662a.m10426a(46, typedArray.getFloat(index, aVar.f8685f.f8794d));
                    break;
                case 47:
                    c7662a.m10426a(47, typedArray.getFloat(index, aVar.f8685f.f8795e));
                    break;
                case 48:
                    c7662a.m10426a(48, typedArray.getFloat(index, aVar.f8685f.f8796f));
                    break;
                case 49:
                    c7662a.m10426a(49, typedArray.getDimension(index, aVar.f8685f.f8797g));
                    break;
                case 50:
                    c7662a.m10426a(50, typedArray.getDimension(index, aVar.f8685f.f8798h));
                    break;
                case 51:
                    c7662a.m10426a(51, typedArray.getDimension(index, aVar.f8685f.f8800j));
                    break;
                case 52:
                    c7662a.m10426a(52, typedArray.getDimension(index, aVar.f8685f.f8801k));
                    break;
                case 53:
                    c7662a.m10426a(53, typedArray.getDimension(index, aVar.f8685f.f8802l));
                    break;
                case 54:
                    c7662a.m10427b(54, typedArray.getInt(index, aVar.f8684e.f8726Z));
                    break;
                case 55:
                    c7662a.m10427b(55, typedArray.getInt(index, aVar.f8684e.f8728a0));
                    break;
                case 56:
                    c7662a.m10427b(56, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8730b0));
                    break;
                case 57:
                    c7662a.m10427b(57, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8732c0));
                    break;
                case 58:
                    c7662a.m10427b(58, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8734d0));
                    break;
                case 59:
                    c7662a.m10427b(59, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8736e0));
                    break;
                case 60:
                    c7662a.m10426a(60, typedArray.getFloat(index, aVar.f8685f.f8792b));
                    break;
                case 62:
                    c7662a.m10427b(62, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8703C));
                    break;
                case 63:
                    c7662a.m10426a(63, typedArray.getFloat(index, aVar.f8684e.f8704D));
                    break;
                case 64:
                    c7662a.m10427b(64, m10409m(typedArray, index, aVar.f8683d.f8772b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c7662a.m10428c(65, typedArray.getString(index));
                    } else {
                        c7662a.m10428c(65, C7198a.f28707c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c7662a.m10427b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c7662a.m10426a(67, typedArray.getFloat(index, aVar.f8683d.f8779i));
                    break;
                case 68:
                    c7662a.m10426a(68, typedArray.getFloat(index, aVar.f8682c.f8789e));
                    break;
                case 69:
                    c7662a.m10426a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c7662a.m10426a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c7662a.m10427b(72, typedArray.getInt(index, aVar.f8684e.f8742h0));
                    break;
                case 73:
                    c7662a.m10427b(73, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8744i0));
                    break;
                case 74:
                    c7662a.m10428c(74, typedArray.getString(index));
                    break;
                case 75:
                    c7662a.m10429d(75, typedArray.getBoolean(index, aVar.f8684e.f8758p0));
                    break;
                case 76:
                    c7662a.m10427b(76, typedArray.getInt(index, aVar.f8683d.f8775e));
                    break;
                case 77:
                    c7662a.m10428c(77, typedArray.getString(index));
                    break;
                case 78:
                    c7662a.m10427b(78, typedArray.getInt(index, aVar.f8682c.f8787c));
                    break;
                case 79:
                    c7662a.m10426a(79, typedArray.getFloat(index, aVar.f8683d.f8777g));
                    break;
                case 80:
                    c7662a.m10429d(80, typedArray.getBoolean(index, aVar.f8684e.f8754n0));
                    break;
                case 81:
                    c7662a.m10429d(81, typedArray.getBoolean(index, aVar.f8684e.f8756o0));
                    break;
                case 82:
                    c7662a.m10427b(82, typedArray.getInteger(index, aVar.f8683d.f8773c));
                    break;
                case 83:
                    c7662a.m10427b(83, m10409m(typedArray, index, aVar.f8685f.f8799i));
                    break;
                case 84:
                    c7662a.m10427b(84, typedArray.getInteger(index, aVar.f8683d.f8781k));
                    break;
                case 85:
                    c7662a.m10426a(85, typedArray.getFloat(index, aVar.f8683d.f8780j));
                    break;
                case 86:
                    int i8 = typedArray.peekValue(index).type;
                    if (i8 == 1) {
                        aVar.f8683d.f8784n = typedArray.getResourceId(index, -1);
                        c7662a.m10427b(89, aVar.f8683d.f8784n);
                        c cVar = aVar.f8683d;
                        if (cVar.f8784n != -1) {
                            cVar.f8783m = -2;
                            c7662a.m10427b(88, -2);
                        }
                    } else if (i8 == 3) {
                        aVar.f8683d.f8782l = typedArray.getString(index);
                        c7662a.m10428c(90, aVar.f8683d.f8782l);
                        if (aVar.f8683d.f8782l.indexOf("/") > 0) {
                            aVar.f8683d.f8784n = typedArray.getResourceId(index, -1);
                            c7662a.m10427b(89, aVar.f8683d.f8784n);
                            aVar.f8683d.f8783m = -2;
                            c7662a.m10427b(88, -2);
                        } else {
                            aVar.f8683d.f8783m = -1;
                            c7662a.m10427b(88, -1);
                        }
                    } else {
                        c cVar2 = aVar.f8683d;
                        cVar2.f8783m = typedArray.getInteger(index, cVar2.f8784n);
                        c7662a.m10427b(88, aVar.f8683d.f8783m);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8672h.get(index));
                    break;
                case 93:
                    c7662a.m10427b(93, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8714N));
                    break;
                case 94:
                    c7662a.m10427b(94, typedArray.getDimensionPixelSize(index, aVar.f8684e.f8721U));
                    break;
                case 95:
                    m10410n(c7662a, typedArray, index, 0);
                    break;
                case 96:
                    m10410n(c7662a, typedArray, index, 1);
                    break;
                case 97:
                    c7662a.m10427b(97, typedArray.getInt(index, aVar.f8684e.f8760q0));
                    break;
                case 98:
                    if (AbstractC7557b.f30212K) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f8680a);
                        aVar.f8680a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f8681b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f8681b = typedArray.getString(index);
                    } else {
                        aVar.f8680a = typedArray.getResourceId(index, aVar.f8680a);
                    }
                    break;
                case 99:
                    c7662a.m10429d(99, typedArray.getBoolean(index, aVar.f8684e.f8743i));
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m10415c(ConstraintLayout constraintLayout) {
        m10416d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: renamed from: d */
    void m10416d(ConstraintLayout constraintLayout, boolean z7) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f8679f.keySet());
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            int id = childAt.getId();
            if (!this.f8679f.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + AbstractC7556a.m33256a(childAt));
            } else {
                if (this.f8678e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f8679f.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f8679f.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof C2410a) {
                                aVar.f8684e.f8746j0 = 1;
                                C2410a c2410a = (C2410a) childAt;
                                c2410a.setId(id);
                                c2410a.setType(aVar.f8684e.f8742h0);
                                c2410a.setMargin(aVar.f8684e.f8744i0);
                                c2410a.setAllowsGoneWidget(aVar.f8684e.f8758p0);
                                b bVar = aVar.f8684e;
                                int[] iArr = bVar.f8748k0;
                                if (iArr != null) {
                                    c2410a.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f8750l0;
                                    if (str != null) {
                                        bVar.f8748k0 = m10406h(c2410a, str);
                                        c2410a.setReferencedIds(aVar.f8684e.f8748k0);
                                    }
                                }
                            }
                            ConstraintLayout.C2408b c2408b = (ConstraintLayout.C2408b) childAt.getLayoutParams();
                            c2408b.m10376a();
                            aVar.m10424b(c2408b);
                            if (z7) {
                                C2411b.m10384c(childAt, aVar.f8686g);
                            }
                            childAt.setLayoutParams(c2408b);
                            d dVar = aVar.f8682c;
                            if (dVar.f8787c == 0) {
                                childAt.setVisibility(dVar.f8786b);
                            }
                            childAt.setAlpha(aVar.f8682c.f8788d);
                            childAt.setRotation(aVar.f8685f.f8792b);
                            childAt.setRotationX(aVar.f8685f.f8793c);
                            childAt.setRotationY(aVar.f8685f.f8794d);
                            childAt.setScaleX(aVar.f8685f.f8795e);
                            childAt.setScaleY(aVar.f8685f.f8796f);
                            e eVar = aVar.f8685f;
                            if (eVar.f8799i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(aVar.f8685f.f8799i);
                                if (viewFindViewById != null) {
                                    float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                    float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left2 = left - childAt.getLeft();
                                        float top2 = top - childAt.getTop();
                                        childAt.setPivotX(left2);
                                        childAt.setPivotY(top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f8797g)) {
                                    childAt.setPivotX(aVar.f8685f.f8797g);
                                }
                                if (!Float.isNaN(aVar.f8685f.f8798h)) {
                                    childAt.setPivotY(aVar.f8685f.f8798h);
                                }
                            }
                            childAt.setTranslationX(aVar.f8685f.f8800j);
                            childAt.setTranslationY(aVar.f8685f.f8801k);
                            childAt.setTranslationZ(aVar.f8685f.f8802l);
                            e eVar2 = aVar.f8685f;
                            if (eVar2.f8803m) {
                                childAt.setElevation(eVar2.f8804n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = (a) this.f8679f.get(num);
            if (aVar2 != null) {
                if (aVar2.f8684e.f8746j0 == 1) {
                    C2410a c2410a2 = new C2410a(constraintLayout.getContext());
                    c2410a2.setId(num.intValue());
                    b bVar2 = aVar2.f8684e;
                    int[] iArr2 = bVar2.f8748k0;
                    if (iArr2 != null) {
                        c2410a2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f8750l0;
                        if (str2 != null) {
                            bVar2.f8748k0 = m10406h(c2410a2, str2);
                            c2410a2.setReferencedIds(aVar2.f8684e.f8748k0);
                        }
                    }
                    c2410a2.setType(aVar2.f8684e.f8742h0);
                    c2410a2.setMargin(aVar2.f8684e.f8744i0);
                    ConstraintLayout.C2408b c2408bM10366g = constraintLayout.generateDefaultLayoutParams();
                    c2410a2.m10399o();
                    aVar2.m10424b(c2408bM10366g);
                    constraintLayout.addView(c2410a2, c2408bM10366g);
                }
                if (aVar2.f8684e.f8727a) {
                    View c2416g = new C2416g(constraintLayout.getContext());
                    c2416g.setId(num.intValue());
                    ConstraintLayout.C2408b c2408bM10366g2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.m10424b(c2408bM10366g2);
                    constraintLayout.addView(c2416g, c2408bM10366g2);
                }
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = constraintLayout.getChildAt(i8);
            if (childAt2 instanceof AbstractC2412c) {
                ((AbstractC2412c) childAt2).mo10394f(constraintLayout);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m10417e(Context context, int i7) {
        m10418f((ConstraintLayout) LayoutInflater.from(context).inflate(i7, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: f */
    public void m10418f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f8679f.clear();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ConstraintLayout.C2408b c2408b = (ConstraintLayout.C2408b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f8678e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f8679f.containsKey(Integer.valueOf(id))) {
                this.f8679f.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f8679f.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.f8686g = C2411b.m10382a(this.f8677d, childAt);
                aVar.m10423d(id, c2408b);
                aVar.f8682c.f8786b = childAt.getVisibility();
                aVar.f8682c.f8788d = childAt.getAlpha();
                aVar.f8685f.f8792b = childAt.getRotation();
                aVar.f8685f.f8793c = childAt.getRotationX();
                aVar.f8685f.f8794d = childAt.getRotationY();
                aVar.f8685f.f8795e = childAt.getScaleX();
                aVar.f8685f.f8796f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f8685f;
                    eVar.f8797g = pivotX;
                    eVar.f8798h = pivotY;
                }
                aVar.f8685f.f8800j = childAt.getTranslationX();
                aVar.f8685f.f8801k = childAt.getTranslationY();
                aVar.f8685f.f8802l = childAt.getTranslationZ();
                e eVar2 = aVar.f8685f;
                if (eVar2.f8803m) {
                    eVar2.f8804n = childAt.getElevation();
                }
                if (childAt instanceof C2410a) {
                    C2410a c2410a = (C2410a) childAt;
                    aVar.f8684e.f8758p0 = c2410a.getAllowsGoneWidget();
                    aVar.f8684e.f8748k0 = c2410a.getReferencedIds();
                    aVar.f8684e.f8742h0 = c2410a.getType();
                    aVar.f8684e.f8744i0 = c2410a.getMargin();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m10419g(int i7, int i8, int i9, float f7) {
        b bVar = m10408j(i7).f8684e;
        bVar.f8702B = i8;
        bVar.f8703C = i9;
        bVar.f8704D = f7;
    }

    /* JADX INFO: renamed from: k */
    public void m10420k(Context context, int i7) {
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarM10407i = m10407i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarM10407i.f8684e.f8727a = true;
                    }
                    this.f8679f.put(Integer.valueOf(aVarM10407i.f8680a), aVarM10407i);
                }
            }
        } catch (IOException e7) {
            Log.e("ConstraintSet", "Error parsing resource: " + i7, e7);
        } catch (XmlPullParserException e8) {
            Log.e("ConstraintSet", "Error parsing resource: " + i7, e8);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: l */
    public void m10421l(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVarM10407i = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    switch (xmlPullParser.getName()) {
                        case "Constraint":
                            aVarM10407i = m10407i(context, Xml.asAttributeSet(xmlPullParser), false);
                            break;
                        case "ConstraintOverride":
                            aVarM10407i = m10407i(context, Xml.asAttributeSet(xmlPullParser), true);
                            break;
                        case "Guideline":
                            aVarM10407i = m10407i(context, Xml.asAttributeSet(xmlPullParser), false);
                            b bVar = aVarM10407i.f8684e;
                            bVar.f8727a = true;
                            bVar.f8729b = true;
                            break;
                        case "Barrier":
                            aVarM10407i = m10407i(context, Xml.asAttributeSet(xmlPullParser), false);
                            aVarM10407i.f8684e.f8746j0 = 1;
                            break;
                        case "PropertySet":
                            if (aVarM10407i == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVarM10407i.f8682c.m10435b(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Transform":
                            if (aVarM10407i == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVarM10407i.f8685f.m10437b(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Layout":
                            if (aVarM10407i == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVarM10407i.f8684e.m10431b(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "Motion":
                            if (aVarM10407i == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVarM10407i.f8683d.m10433b(context, Xml.asAttributeSet(xmlPullParser));
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (aVarM10407i == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            C2411b.m10383b(context, xmlPullParser, aVarM10407i.f8686g);
                            break;
                            break;
                    }
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r6 == 0) {
                        return;
                    }
                    if (r6 == 1 || r6 == 2 || r6 == 3) {
                        this.f8679f.put(Integer.valueOf(aVarM10407i.f8680a), aVarM10407i);
                        aVarM10407i = null;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e7) {
            Log.e("ConstraintSet", "Error parsing XML resource", e7);
        } catch (XmlPullParserException e8) {
            Log.e("ConstraintSet", "Error parsing XML resource", e8);
        }
    }
}
