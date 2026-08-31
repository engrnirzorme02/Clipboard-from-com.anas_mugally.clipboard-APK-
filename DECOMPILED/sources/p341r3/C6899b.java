package p341r3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.drawable.AbstractC4498d;
import com.google.android.material.internal.AbstractC4543s;
import java.util.Locale;
import p045F3.AbstractC0423c;
import p045F3.C0424d;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6749j;
import p325p3.AbstractC6750k;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;

/* JADX INFO: renamed from: r3.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6899b {

    /* JADX INFO: renamed from: a */
    private final a f27673a;

    /* JADX INFO: renamed from: b */
    private final a f27674b;

    /* JADX INFO: renamed from: c */
    final float f27675c;

    /* JADX INFO: renamed from: d */
    final float f27676d;

    /* JADX INFO: renamed from: e */
    final float f27677e;

    /* JADX INFO: renamed from: f */
    final float f27678f;

    /* JADX INFO: renamed from: g */
    final float f27679g;

    /* JADX INFO: renamed from: h */
    final float f27680h;

    /* JADX INFO: renamed from: i */
    final int f27681i;

    /* JADX INFO: renamed from: j */
    final int f27682j;

    /* JADX INFO: renamed from: k */
    int f27683k;

    /* JADX INFO: renamed from: l */
    int f27684l;

    C6899b(Context context, int i7, int i8, int i9, a aVar) {
        a aVar2 = new a();
        this.f27674b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i7 != 0) {
            aVar.f27701a = i7;
        }
        TypedArray typedArrayM30154a = m30154a(context, aVar.f27701a, i8, i9);
        Resources resources = context.getResources();
        this.f27675c = typedArrayM30154a.getDimensionPixelSize(AbstractC6752m.f27075v, -1);
        this.f27681i = context.getResources().getDimensionPixelSize(AbstractC6744e.f26328W);
        this.f27682j = context.getResources().getDimensionPixelSize(AbstractC6744e.f26330Y);
        this.f27676d = typedArrayM30154a.getDimensionPixelSize(AbstractC6752m.f26617F, -1);
        int i10 = AbstractC6752m.f26595D;
        int i11 = AbstractC6744e.f26364q;
        this.f27677e = typedArrayM30154a.getDimension(i10, resources.getDimension(i11));
        int i12 = AbstractC6752m.f26650I;
        int i13 = AbstractC6744e.f26366r;
        this.f27679g = typedArrayM30154a.getDimension(i12, resources.getDimension(i13));
        this.f27678f = typedArrayM30154a.getDimension(AbstractC6752m.f27064u, resources.getDimension(i11));
        this.f27680h = typedArrayM30154a.getDimension(AbstractC6752m.f26606E, resources.getDimension(i13));
        boolean z7 = true;
        this.f27683k = typedArrayM30154a.getInt(AbstractC6752m.f26727P, 1);
        this.f27684l = typedArrayM30154a.getInt(AbstractC6752m.f27042s, 0);
        aVar2.f27709t = aVar.f27709t == -2 ? 255 : aVar.f27709t;
        if (aVar.f27711v != -2) {
            aVar2.f27711v = aVar.f27711v;
        } else {
            int i14 = AbstractC6752m.f26716O;
            if (typedArrayM30154a.hasValue(i14)) {
                aVar2.f27711v = typedArrayM30154a.getInt(i14, 0);
            } else {
                aVar2.f27711v = -1;
            }
        }
        if (aVar.f27710u != null) {
            aVar2.f27710u = aVar.f27710u;
        } else {
            int i15 = AbstractC6752m.f27108y;
            if (typedArrayM30154a.hasValue(i15)) {
                aVar2.f27710u = typedArrayM30154a.getString(i15);
            }
        }
        aVar2.f27715z = aVar.f27715z;
        aVar2.f27685A = aVar.f27685A == null ? context.getString(AbstractC6750k.f26513m) : aVar.f27685A;
        aVar2.f27686B = aVar.f27686B == 0 ? AbstractC6749j.f26478a : aVar.f27686B;
        aVar2.f27687C = aVar.f27687C == 0 ? AbstractC6750k.f26518r : aVar.f27687C;
        if (aVar.f27689E != null && !aVar.f27689E.booleanValue()) {
            z7 = false;
        }
        aVar2.f27689E = Boolean.valueOf(z7);
        aVar2.f27712w = aVar.f27712w == -2 ? typedArrayM30154a.getInt(AbstractC6752m.f26694M, -2) : aVar.f27712w;
        aVar2.f27713x = aVar.f27713x == -2 ? typedArrayM30154a.getInt(AbstractC6752m.f26705N, -2) : aVar.f27713x;
        aVar2.f27705e = Integer.valueOf(aVar.f27705e == null ? typedArrayM30154a.getResourceId(AbstractC6752m.f27086w, AbstractC6751l.f26538c) : aVar.f27705e.intValue());
        aVar2.f27706f = Integer.valueOf(aVar.f27706f == null ? typedArrayM30154a.getResourceId(AbstractC6752m.f27097x, 0) : aVar.f27706f.intValue());
        aVar2.f27707r = Integer.valueOf(aVar.f27707r == null ? typedArrayM30154a.getResourceId(AbstractC6752m.f26628G, AbstractC6751l.f26538c) : aVar.f27707r.intValue());
        aVar2.f27708s = Integer.valueOf(aVar.f27708s == null ? typedArrayM30154a.getResourceId(AbstractC6752m.f26639H, 0) : aVar.f27708s.intValue());
        aVar2.f27702b = Integer.valueOf(aVar.f27702b == null ? m30153G(context, typedArrayM30154a, AbstractC6752m.f27031r) : aVar.f27702b.intValue());
        aVar2.f27704d = Integer.valueOf(aVar.f27704d == null ? typedArrayM30154a.getResourceId(AbstractC6752m.f27119z, AbstractC6751l.f26540e) : aVar.f27704d.intValue());
        if (aVar.f27703c != null) {
            aVar2.f27703c = aVar.f27703c;
        } else {
            int i16 = AbstractC6752m.f26562A;
            if (typedArrayM30154a.hasValue(i16)) {
                aVar2.f27703c = Integer.valueOf(m30153G(context, typedArrayM30154a, i16));
            } else {
                aVar2.f27703c = Integer.valueOf(new C0424d(context, aVar2.f27704d.intValue()).m1845j().getDefaultColor());
            }
        }
        aVar2.f27688D = Integer.valueOf(aVar.f27688D == null ? typedArrayM30154a.getInt(AbstractC6752m.f27053t, 8388661) : aVar.f27688D.intValue());
        aVar2.f27690F = Integer.valueOf(aVar.f27690F == null ? typedArrayM30154a.getDimensionPixelSize(AbstractC6752m.f26584C, resources.getDimensionPixelSize(AbstractC6744e.f26329X)) : aVar.f27690F.intValue());
        aVar2.f27691G = Integer.valueOf(aVar.f27691G == null ? typedArrayM30154a.getDimensionPixelSize(AbstractC6752m.f26573B, resources.getDimensionPixelSize(AbstractC6744e.f26368s)) : aVar.f27691G.intValue());
        aVar2.f27692H = Integer.valueOf(aVar.f27692H == null ? typedArrayM30154a.getDimensionPixelOffset(AbstractC6752m.f26661J, 0) : aVar.f27692H.intValue());
        aVar2.f27693I = Integer.valueOf(aVar.f27693I == null ? typedArrayM30154a.getDimensionPixelOffset(AbstractC6752m.f26738Q, 0) : aVar.f27693I.intValue());
        aVar2.f27694J = Integer.valueOf(aVar.f27694J == null ? typedArrayM30154a.getDimensionPixelOffset(AbstractC6752m.f26672K, aVar2.f27692H.intValue()) : aVar.f27694J.intValue());
        aVar2.f27695K = Integer.valueOf(aVar.f27695K == null ? typedArrayM30154a.getDimensionPixelOffset(AbstractC6752m.f26749R, aVar2.f27693I.intValue()) : aVar.f27695K.intValue());
        aVar2.f27698N = Integer.valueOf(aVar.f27698N == null ? typedArrayM30154a.getDimensionPixelOffset(AbstractC6752m.f26683L, 0) : aVar.f27698N.intValue());
        aVar2.f27696L = Integer.valueOf(aVar.f27696L == null ? 0 : aVar.f27696L.intValue());
        aVar2.f27697M = Integer.valueOf(aVar.f27697M == null ? 0 : aVar.f27697M.intValue());
        aVar2.f27699O = Boolean.valueOf(aVar.f27699O == null ? typedArrayM30154a.getBoolean(AbstractC6752m.f27020q, false) : aVar.f27699O.booleanValue());
        typedArrayM30154a.recycle();
        if (aVar.f27714y == null) {
            aVar2.f27714y = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar2.f27714y = aVar.f27714y;
        }
        this.f27673a = aVar;
    }

    /* JADX INFO: renamed from: G */
    private static int m30153G(Context context, TypedArray typedArray, int i7) {
        return AbstractC0423c.m1825a(context, typedArray, i7).getDefaultColor();
    }

    /* JADX INFO: renamed from: a */
    private TypedArray m30154a(Context context, int i7, int i8, int i9) {
        AttributeSet attributeSetM20439k;
        int styleAttribute;
        if (i7 != 0) {
            attributeSetM20439k = AbstractC4498d.m20439k(context, i7, "badge");
            styleAttribute = attributeSetM20439k.getStyleAttribute();
        } else {
            attributeSetM20439k = null;
            styleAttribute = 0;
        }
        return AbstractC4543s.m20818i(context, attributeSetM20439k, AbstractC6752m.f27009p, i8, styleAttribute == 0 ? i9 : styleAttribute, new int[0]);
    }

    /* JADX INFO: renamed from: A */
    int m30155A() {
        return this.f27674b.f27695K.intValue();
    }

    /* JADX INFO: renamed from: B */
    int m30156B() {
        return this.f27674b.f27693I.intValue();
    }

    /* JADX INFO: renamed from: C */
    boolean m30157C() {
        return this.f27674b.f27711v != -1;
    }

    /* JADX INFO: renamed from: D */
    boolean m30158D() {
        return this.f27674b.f27710u != null;
    }

    /* JADX INFO: renamed from: E */
    boolean m30159E() {
        return this.f27674b.f27699O.booleanValue();
    }

    /* JADX INFO: renamed from: F */
    boolean m30160F() {
        return this.f27674b.f27689E.booleanValue();
    }

    /* JADX INFO: renamed from: H */
    void m30161H(int i7) {
        this.f27673a.f27709t = i7;
        this.f27674b.f27709t = i7;
    }

    /* JADX INFO: renamed from: b */
    int m30162b() {
        return this.f27674b.f27696L.intValue();
    }

    /* JADX INFO: renamed from: c */
    int m30163c() {
        return this.f27674b.f27697M.intValue();
    }

    /* JADX INFO: renamed from: d */
    int m30164d() {
        return this.f27674b.f27709t;
    }

    /* JADX INFO: renamed from: e */
    int m30165e() {
        return this.f27674b.f27702b.intValue();
    }

    /* JADX INFO: renamed from: f */
    int m30166f() {
        return this.f27674b.f27688D.intValue();
    }

    /* JADX INFO: renamed from: g */
    int m30167g() {
        return this.f27674b.f27690F.intValue();
    }

    /* JADX INFO: renamed from: h */
    int m30168h() {
        return this.f27674b.f27706f.intValue();
    }

    /* JADX INFO: renamed from: i */
    int m30169i() {
        return this.f27674b.f27705e.intValue();
    }

    /* JADX INFO: renamed from: j */
    int m30170j() {
        return this.f27674b.f27703c.intValue();
    }

    /* JADX INFO: renamed from: k */
    int m30171k() {
        return this.f27674b.f27691G.intValue();
    }

    /* JADX INFO: renamed from: l */
    int m30172l() {
        return this.f27674b.f27708s.intValue();
    }

    /* JADX INFO: renamed from: m */
    int m30173m() {
        return this.f27674b.f27707r.intValue();
    }

    /* JADX INFO: renamed from: n */
    int m30174n() {
        return this.f27674b.f27687C;
    }

    /* JADX INFO: renamed from: o */
    CharSequence m30175o() {
        return this.f27674b.f27715z;
    }

    /* JADX INFO: renamed from: p */
    CharSequence m30176p() {
        return this.f27674b.f27685A;
    }

    /* JADX INFO: renamed from: q */
    int m30177q() {
        return this.f27674b.f27686B;
    }

    /* JADX INFO: renamed from: r */
    int m30178r() {
        return this.f27674b.f27694J.intValue();
    }

    /* JADX INFO: renamed from: s */
    int m30179s() {
        return this.f27674b.f27692H.intValue();
    }

    /* JADX INFO: renamed from: t */
    int m30180t() {
        return this.f27674b.f27698N.intValue();
    }

    /* JADX INFO: renamed from: u */
    int m30181u() {
        return this.f27674b.f27712w;
    }

    /* JADX INFO: renamed from: v */
    int m30182v() {
        return this.f27674b.f27713x;
    }

    /* JADX INFO: renamed from: w */
    int m30183w() {
        return this.f27674b.f27711v;
    }

    /* JADX INFO: renamed from: x */
    Locale m30184x() {
        return this.f27674b.f27714y;
    }

    /* JADX INFO: renamed from: y */
    String m30185y() {
        return this.f27674b.f27710u;
    }

    /* JADX INFO: renamed from: z */
    int m30186z() {
        return this.f27674b.f27704d.intValue();
    }

    /* JADX INFO: renamed from: r3.b$a */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C7717a();

        /* JADX INFO: renamed from: A */
        private CharSequence f27685A;

        /* JADX INFO: renamed from: B */
        private int f27686B;

        /* JADX INFO: renamed from: C */
        private int f27687C;

        /* JADX INFO: renamed from: D */
        private Integer f27688D;

        /* JADX INFO: renamed from: E */
        private Boolean f27689E;

        /* JADX INFO: renamed from: F */
        private Integer f27690F;

        /* JADX INFO: renamed from: G */
        private Integer f27691G;

        /* JADX INFO: renamed from: H */
        private Integer f27692H;

        /* JADX INFO: renamed from: I */
        private Integer f27693I;

        /* JADX INFO: renamed from: J */
        private Integer f27694J;

        /* JADX INFO: renamed from: K */
        private Integer f27695K;

        /* JADX INFO: renamed from: L */
        private Integer f27696L;

        /* JADX INFO: renamed from: M */
        private Integer f27697M;

        /* JADX INFO: renamed from: N */
        private Integer f27698N;

        /* JADX INFO: renamed from: O */
        private Boolean f27699O;

        /* JADX INFO: renamed from: P */
        private Integer f27700P;

        /* JADX INFO: renamed from: a */
        private int f27701a;

        /* JADX INFO: renamed from: b */
        private Integer f27702b;

        /* JADX INFO: renamed from: c */
        private Integer f27703c;

        /* JADX INFO: renamed from: d */
        private Integer f27704d;

        /* JADX INFO: renamed from: e */
        private Integer f27705e;

        /* JADX INFO: renamed from: f */
        private Integer f27706f;

        /* JADX INFO: renamed from: r */
        private Integer f27707r;

        /* JADX INFO: renamed from: s */
        private Integer f27708s;

        /* JADX INFO: renamed from: t */
        private int f27709t;

        /* JADX INFO: renamed from: u */
        private String f27710u;

        /* JADX INFO: renamed from: v */
        private int f27711v;

        /* JADX INFO: renamed from: w */
        private int f27712w;

        /* JADX INFO: renamed from: x */
        private int f27713x;

        /* JADX INFO: renamed from: y */
        private Locale f27714y;

        /* JADX INFO: renamed from: z */
        private CharSequence f27715z;

        /* JADX INFO: renamed from: r3.b$a$a, reason: collision with other inner class name */
        class C7717a implements Parcelable.Creator {
            C7717a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i7) {
                return new a[i7];
            }
        }

        public a() {
            this.f27709t = 255;
            this.f27711v = -2;
            this.f27712w = -2;
            this.f27713x = -2;
            this.f27689E = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f27701a);
            parcel.writeSerializable(this.f27702b);
            parcel.writeSerializable(this.f27703c);
            parcel.writeSerializable(this.f27704d);
            parcel.writeSerializable(this.f27705e);
            parcel.writeSerializable(this.f27706f);
            parcel.writeSerializable(this.f27707r);
            parcel.writeSerializable(this.f27708s);
            parcel.writeInt(this.f27709t);
            parcel.writeString(this.f27710u);
            parcel.writeInt(this.f27711v);
            parcel.writeInt(this.f27712w);
            parcel.writeInt(this.f27713x);
            CharSequence charSequence = this.f27715z;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f27685A;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f27686B);
            parcel.writeSerializable(this.f27688D);
            parcel.writeSerializable(this.f27690F);
            parcel.writeSerializable(this.f27691G);
            parcel.writeSerializable(this.f27692H);
            parcel.writeSerializable(this.f27693I);
            parcel.writeSerializable(this.f27694J);
            parcel.writeSerializable(this.f27695K);
            parcel.writeSerializable(this.f27698N);
            parcel.writeSerializable(this.f27696L);
            parcel.writeSerializable(this.f27697M);
            parcel.writeSerializable(this.f27689E);
            parcel.writeSerializable(this.f27714y);
            parcel.writeSerializable(this.f27699O);
            parcel.writeSerializable(this.f27700P);
        }

        a(Parcel parcel) {
            this.f27709t = 255;
            this.f27711v = -2;
            this.f27712w = -2;
            this.f27713x = -2;
            this.f27689E = Boolean.TRUE;
            this.f27701a = parcel.readInt();
            this.f27702b = (Integer) parcel.readSerializable();
            this.f27703c = (Integer) parcel.readSerializable();
            this.f27704d = (Integer) parcel.readSerializable();
            this.f27705e = (Integer) parcel.readSerializable();
            this.f27706f = (Integer) parcel.readSerializable();
            this.f27707r = (Integer) parcel.readSerializable();
            this.f27708s = (Integer) parcel.readSerializable();
            this.f27709t = parcel.readInt();
            this.f27710u = parcel.readString();
            this.f27711v = parcel.readInt();
            this.f27712w = parcel.readInt();
            this.f27713x = parcel.readInt();
            this.f27715z = parcel.readString();
            this.f27685A = parcel.readString();
            this.f27686B = parcel.readInt();
            this.f27688D = (Integer) parcel.readSerializable();
            this.f27690F = (Integer) parcel.readSerializable();
            this.f27691G = (Integer) parcel.readSerializable();
            this.f27692H = (Integer) parcel.readSerializable();
            this.f27693I = (Integer) parcel.readSerializable();
            this.f27694J = (Integer) parcel.readSerializable();
            this.f27695K = (Integer) parcel.readSerializable();
            this.f27698N = (Integer) parcel.readSerializable();
            this.f27696L = (Integer) parcel.readSerializable();
            this.f27697M = (Integer) parcel.readSerializable();
            this.f27689E = (Boolean) parcel.readSerializable();
            this.f27714y = (Locale) parcel.readSerializable();
            this.f27699O = (Boolean) parcel.readSerializable();
            this.f27700P = (Integer) parcel.readSerializable();
        }
    }
}
