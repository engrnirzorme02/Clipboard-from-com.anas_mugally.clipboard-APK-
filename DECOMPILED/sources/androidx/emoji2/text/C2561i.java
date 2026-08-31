package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: androidx.emoji2.text.i */
/* JADX INFO: loaded from: classes.dex */
final class C2561i {

    /* JADX INFO: renamed from: a */
    private final C2558f.j f9853a;

    /* JADX INFO: renamed from: b */
    private final C2566n f9854b;

    /* JADX INFO: renamed from: c */
    private C2558f.e f9855c;

    /* JADX INFO: renamed from: d */
    private final boolean f9856d;

    /* JADX INFO: renamed from: e */
    private final int[] f9857e;

    /* JADX INFO: renamed from: androidx.emoji2.text.i$a */
    private static final class a {
        /* JADX INFO: renamed from: a */
        static int m11790a(CharSequence charSequence, int i7, int i8) {
            int length = charSequence.length();
            if (i7 < 0 || length < i7 || i8 < 0) {
                return -1;
            }
            while (true) {
                boolean z7 = false;
                while (i8 != 0) {
                    i7--;
                    if (i7 < 0) {
                        return z7 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i7);
                    if (z7) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i8--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i8--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z7 = true;
                    }
                }
                return i7;
            }
        }

        /* JADX INFO: renamed from: b */
        static int m11791b(CharSequence charSequence, int i7, int i8) {
            int length = charSequence.length();
            if (i7 < 0 || length < i7 || i8 < 0) {
                return -1;
            }
            while (true) {
                boolean z7 = false;
                while (i8 != 0) {
                    if (i7 >= length) {
                        if (z7) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i7);
                    if (z7) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i8--;
                        i7++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i8--;
                        i7++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i7++;
                        z7 = true;
                    }
                }
                return i7;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.i$b */
    private static class b implements c {

        /* JADX INFO: renamed from: a */
        public C2570r f9858a;

        /* JADX INFO: renamed from: b */
        private final C2558f.j f9859b;

        b(C2570r c2570r, C2558f.j jVar) {
            this.f9858a = c2570r;
            this.f9859b = jVar;
        }

        @Override // androidx.emoji2.text.C2561i.c
        /* JADX INFO: renamed from: b */
        public boolean mo11793b(CharSequence charSequence, int i7, int i8, C2568p c2568p) {
            if (c2568p.m11856k()) {
                return true;
            }
            if (this.f9858a == null) {
                this.f9858a = new C2570r(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f9858a.setSpan(this.f9859b.mo11777a(c2568p), i7, i8, 33);
            return true;
        }

        @Override // androidx.emoji2.text.C2561i.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C2570r mo11792a() {
            return this.f9858a;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.i$c */
    private interface c {
        /* JADX INFO: renamed from: a */
        Object mo11792a();

        /* JADX INFO: renamed from: b */
        boolean mo11793b(CharSequence charSequence, int i7, int i8, C2568p c2568p);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.i$d */
    private static class d implements c {

        /* JADX INFO: renamed from: a */
        private final String f9860a;

        d(String str) {
            this.f9860a = str;
        }

        @Override // androidx.emoji2.text.C2561i.c
        /* JADX INFO: renamed from: b */
        public boolean mo11793b(CharSequence charSequence, int i7, int i8, C2568p c2568p) {
            if (!TextUtils.equals(charSequence.subSequence(i7, i8), this.f9860a)) {
                return true;
            }
            c2568p.m11857l(true);
            return false;
        }

        @Override // androidx.emoji2.text.C2561i.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d mo11792a() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.i$e */
    static final class e {

        /* JADX INFO: renamed from: a */
        private int f9861a = 1;

        /* JADX INFO: renamed from: b */
        private final C2566n.a f9862b;

        /* JADX INFO: renamed from: c */
        private C2566n.a f9863c;

        /* JADX INFO: renamed from: d */
        private C2566n.a f9864d;

        /* JADX INFO: renamed from: e */
        private int f9865e;

        /* JADX INFO: renamed from: f */
        private int f9866f;

        /* JADX INFO: renamed from: g */
        private final boolean f9867g;

        /* JADX INFO: renamed from: h */
        private final int[] f9868h;

        e(C2566n.a aVar, boolean z7, int[] iArr) {
            this.f9862b = aVar;
            this.f9863c = aVar;
            this.f9867g = z7;
            this.f9868h = iArr;
        }

        /* JADX INFO: renamed from: d */
        private static boolean m11796d(int i7) {
            return i7 == 65039;
        }

        /* JADX INFO: renamed from: f */
        private static boolean m11797f(int i7) {
            return i7 == 65038;
        }

        /* JADX INFO: renamed from: g */
        private int m11798g() {
            this.f9861a = 1;
            this.f9863c = this.f9862b;
            this.f9866f = 0;
            return 1;
        }

        /* JADX INFO: renamed from: h */
        private boolean m11799h() {
            if (this.f9863c.m11832b().m11855j() || m11796d(this.f9865e)) {
                return true;
            }
            if (this.f9867g) {
                if (this.f9868h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f9868h, this.f9863c.m11832b().m11848b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        int m11800a(int i7) {
            C2566n.a aVarM11831a = this.f9863c.m11831a(i7);
            int iM11798g = 2;
            if (this.f9861a != 2) {
                if (aVarM11831a == null) {
                    iM11798g = m11798g();
                } else {
                    this.f9861a = 2;
                    this.f9863c = aVarM11831a;
                    this.f9866f = 1;
                }
            } else if (aVarM11831a != null) {
                this.f9863c = aVarM11831a;
                this.f9866f++;
            } else if (m11797f(i7)) {
                iM11798g = m11798g();
            } else if (!m11796d(i7)) {
                if (this.f9863c.m11832b() != null) {
                    iM11798g = 3;
                    if (this.f9866f != 1 || m11799h()) {
                        this.f9864d = this.f9863c;
                        m11798g();
                    } else {
                        iM11798g = m11798g();
                    }
                } else {
                    iM11798g = m11798g();
                }
            }
            this.f9865e = i7;
            return iM11798g;
        }

        /* JADX INFO: renamed from: b */
        C2568p m11801b() {
            return this.f9863c.m11832b();
        }

        /* JADX INFO: renamed from: c */
        C2568p m11802c() {
            return this.f9864d.m11832b();
        }

        /* JADX INFO: renamed from: e */
        boolean m11803e() {
            if (this.f9861a != 2 || this.f9863c.m11832b() == null) {
                return false;
            }
            return this.f9866f > 1 || m11799h();
        }
    }

    C2561i(C2566n c2566n, C2558f.j jVar, C2558f.e eVar, boolean z7, int[] iArr, Set set) {
        this.f9853a = jVar;
        this.f9854b = c2566n;
        this.f9855c = eVar;
        this.f9856d = z7;
        this.f9857e = iArr;
        m11787g(set);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m11781a(Editable editable, KeyEvent keyEvent, boolean z7) {
        AbstractC2562j[] abstractC2562jArr;
        if (m11786f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m11785e(selectionStart, selectionEnd) && (abstractC2562jArr = (AbstractC2562j[]) editable.getSpans(selectionStart, selectionEnd, AbstractC2562j.class)) != null && abstractC2562jArr.length > 0) {
            for (AbstractC2562j abstractC2562j : abstractC2562jArr) {
                int spanStart = editable.getSpanStart(abstractC2562j);
                int spanEnd = editable.getSpanEnd(abstractC2562j);
                if ((z7 && spanStart == selectionStart) || ((!z7 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    static boolean m11782b(InputConnection inputConnection, Editable editable, int i7, int i8, boolean z7) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i7 >= 0 && i8 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m11785e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z7) {
                iMax = a.m11790a(editable, selectionStart, Math.max(i7, 0));
                iMin = a.m11791b(editable, selectionEnd, Math.max(i8, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i7, 0);
                iMin = Math.min(selectionEnd + i8, editable.length());
            }
            AbstractC2562j[] abstractC2562jArr = (AbstractC2562j[]) editable.getSpans(iMax, iMin, AbstractC2562j.class);
            if (abstractC2562jArr != null && abstractC2562jArr.length > 0) {
                for (AbstractC2562j abstractC2562j : abstractC2562jArr) {
                    int spanStart = editable.getSpanStart(abstractC2562j);
                    int spanEnd = editable.getSpanEnd(abstractC2562j);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    static boolean m11783c(Editable editable, int i7, KeyEvent keyEvent) {
        boolean zM11781a;
        if (i7 != 67) {
            zM11781a = i7 != 112 ? false : m11781a(editable, keyEvent, true);
        } else {
            zM11781a = m11781a(editable, keyEvent, false);
        }
        if (!zM11781a) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* JADX INFO: renamed from: d */
    private boolean m11784d(CharSequence charSequence, int i7, int i8, C2568p c2568p) {
        if (c2568p.m11850d() == 0) {
            c2568p.m11858m(this.f9855c.mo11748a(charSequence, i7, i8, c2568p.m11853h()));
        }
        return c2568p.m11850d() == 2;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m11785e(int i7, int i8) {
        return i7 == -1 || i8 == -1 || i7 != i8;
    }

    /* JADX INFO: renamed from: f */
    private static boolean m11786f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX INFO: renamed from: g */
    private void m11787g(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m11788i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    /* JADX INFO: renamed from: i */
    private Object m11788i(CharSequence charSequence, int i7, int i8, int i9, boolean z7, c cVar) {
        int iCharCount;
        e eVar = new e(this.f9854b.m11828f(), this.f9856d, this.f9857e);
        int i10 = 0;
        boolean zMo11793b = true;
        int iCodePointAt = Character.codePointAt(charSequence, i7);
        loop0: while (true) {
            iCharCount = i7;
            while (true) {
                if (i7 >= i8 || i10 >= i9 || !zMo11793b) {
                    break loop0;
                }
                int iM11800a = eVar.m11800a(iCodePointAt);
                if (iM11800a == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i8) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i7 = iCharCount;
                } else if (iM11800a == 2) {
                    i7 += Character.charCount(iCodePointAt);
                    if (i7 < i8) {
                        iCodePointAt = Character.codePointAt(charSequence, i7);
                    }
                } else if (iM11800a != 3) {
                }
            }
            if (z7 || !m11784d(charSequence, iCharCount, i7, eVar.m11802c())) {
                zMo11793b = cVar.mo11793b(charSequence, iCharCount, i7, eVar.m11802c());
                i10++;
            }
        }
        if (eVar.m11803e() && i10 < i9 && zMo11793b && (z7 || !m11784d(charSequence, iCharCount, i7, eVar.m11801b()))) {
            cVar.mo11793b(charSequence, iCharCount, i7, eVar.m11801b());
        }
        return cVar.mo11792a();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    CharSequence m11789h(CharSequence charSequence, int i7, int i8, int i9, boolean z7) throws Throwable {
        C2570r c2570r;
        CharSequence charSequence2;
        Throwable th;
        int i10;
        int i11;
        AbstractC2562j[] abstractC2562jArr;
        int i12;
        int spanStart;
        boolean z8 = charSequence instanceof C2567o;
        if (z8) {
            ((C2567o) charSequence).m11841a();
        }
        if (z8) {
            c2570r = new C2570r((Spannable) charSequence);
            if (c2570r != null) {
                for (AbstractC2562j abstractC2562j : abstractC2562jArr) {
                    spanStart = c2570r.getSpanStart(abstractC2562j);
                    int spanEnd = c2570r.getSpanEnd(abstractC2562j);
                    if (spanStart != i8) {
                        c2570r.removeSpan(abstractC2562j);
                    }
                    i7 = Math.min(spanStart, i7);
                    i8 = Math.max(spanEnd, i8);
                }
            }
            i10 = i7;
            i11 = i8;
            if (i10 == i11) {
                charSequence2 = charSequence;
                if (!z8) {
                    return charSequence2;
                }
                ((C2567o) charSequence2).m11842d();
            } else {
                charSequence2 = charSequence;
                if (!z8) {
                    return charSequence2;
                }
                ((C2567o) charSequence2).m11842d();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    c2570r = new C2570r((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z8) {
                        throw th;
                    }
                    ((C2567o) charSequence2).m11842d();
                    throw th;
                }
            } else {
                c2570r = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i7 + (-1), i8 + 1, AbstractC2562j.class) > i8) ? null : new C2570r(charSequence);
            }
            if (c2570r != null && (abstractC2562jArr = (AbstractC2562j[]) c2570r.getSpans(i7, i8, AbstractC2562j.class)) != null && abstractC2562jArr.length > 0) {
                while (i12 < r5) {
                    spanStart = c2570r.getSpanStart(abstractC2562j);
                    int spanEnd2 = c2570r.getSpanEnd(abstractC2562j);
                    if (spanStart != i8) {
                        c2570r.removeSpan(abstractC2562j);
                    }
                    i7 = Math.min(spanStart, i7);
                    i8 = Math.max(spanEnd2, i8);
                }
            }
            i10 = i7;
            i11 = i8;
            if (i10 == i11 && i10 < charSequence.length()) {
                if (i9 != Integer.MAX_VALUE && c2570r != null) {
                    i9 -= ((AbstractC2562j[]) c2570r.getSpans(0, c2570r.length(), AbstractC2562j.class)).length;
                }
                charSequence2 = charSequence;
                try {
                    C2570r c2570r2 = (C2570r) m11788i(charSequence2, i10, i11, i9, z7, new b(c2570r, this.f9853a));
                    if (c2570r2 == null) {
                        if (z8) {
                        }
                        return charSequence2;
                    }
                    Spannable spannableM11864b = c2570r2.m11864b();
                    if (z8) {
                        ((C2567o) charSequence2).m11842d();
                    }
                    return spannableM11864b;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z8) {
                        throw th;
                    }
                    ((C2567o) charSequence2).m11842d();
                    throw th;
                }
            }
            charSequence2 = charSequence;
            if (!z8) {
                return charSequence2;
            }
            ((C2567o) charSequence2).m11842d();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z8) {
            throw th;
        }
        ((C2567o) charSequence2).m11842d();
        throw th;
    }
}
