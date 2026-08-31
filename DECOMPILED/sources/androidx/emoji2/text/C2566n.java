package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import p081K.AbstractC0723o;
import p104N.AbstractC0910g;
import p232e0.C5251b;

/* JADX INFO: renamed from: androidx.emoji2.text.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2566n {

    /* JADX INFO: renamed from: a */
    private final C5251b f9889a;

    /* JADX INFO: renamed from: b */
    private final char[] f9890b;

    /* JADX INFO: renamed from: c */
    private final a f9891c = new a(1024);

    /* JADX INFO: renamed from: d */
    private final Typeface f9892d;

    /* JADX INFO: renamed from: androidx.emoji2.text.n$a */
    static class a {

        /* JADX INFO: renamed from: a */
        private final SparseArray f9893a;

        /* JADX INFO: renamed from: b */
        private C2568p f9894b;

        private a() {
            this(1);
        }

        /* JADX INFO: renamed from: a */
        a m11831a(int i7) {
            SparseArray sparseArray = this.f9893a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i7);
        }

        /* JADX INFO: renamed from: b */
        final C2568p m11832b() {
            return this.f9894b;
        }

        /* JADX INFO: renamed from: c */
        void m11833c(C2568p c2568p, int i7, int i8) {
            a aVarM11831a = m11831a(c2568p.m11848b(i7));
            if (aVarM11831a == null) {
                aVarM11831a = new a();
                this.f9893a.put(c2568p.m11848b(i7), aVarM11831a);
            }
            if (i8 > i7) {
                aVarM11831a.m11833c(c2568p, i7 + 1, i8);
            } else {
                aVarM11831a.f9894b = c2568p;
            }
        }

        a(int i7) {
            this.f9893a = new SparseArray(i7);
        }
    }

    private C2566n(Typeface typeface, C5251b c5251b) {
        this.f9892d = typeface;
        this.f9889a = c5251b;
        this.f9890b = new char[c5251b.m24261k() * 2];
        m11823a(c5251b);
    }

    /* JADX INFO: renamed from: a */
    private void m11823a(C5251b c5251b) {
        int iM24261k = c5251b.m24261k();
        for (int i7 = 0; i7 < iM24261k; i7++) {
            C2568p c2568p = new C2568p(this, i7);
            Character.toChars(c2568p.m11852f(), this.f9890b, i7 * 2);
            m11830h(c2568p);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C2566n m11824b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            AbstractC0723o.m3486a("EmojiCompat.MetadataRepo.create");
            return new C2566n(typeface, AbstractC2565m.m11816b(byteBuffer));
        } finally {
            AbstractC0723o.m3487b();
        }
    }

    /* JADX INFO: renamed from: c */
    public char[] m11825c() {
        return this.f9890b;
    }

    /* JADX INFO: renamed from: d */
    public C5251b m11826d() {
        return this.f9889a;
    }

    /* JADX INFO: renamed from: e */
    int m11827e() {
        return this.f9889a.m24262l();
    }

    /* JADX INFO: renamed from: f */
    a m11828f() {
        return this.f9891c;
    }

    /* JADX INFO: renamed from: g */
    Typeface m11829g() {
        return this.f9892d;
    }

    /* JADX INFO: renamed from: h */
    void m11830h(C2568p c2568p) {
        AbstractC0910g.m4140h(c2568p, "emoji metadata cannot be null");
        AbstractC0910g.m4134b(c2568p.m11849c() > 0, "invalid metadata codepoint length");
        this.f9891c.m11833c(c2568p, 0, c2568p.m11849c() - 1);
    }
}
