package p302m6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1435m;
import p238e6.InterfaceC5371p;
import p246f6.InterfaceC5442a;
import p278j6.AbstractC5905g;
import p278j6.C5904f;
import p294l6.InterfaceC6304e;

/* JADX INFO: renamed from: m6.e */
/* JADX INFO: loaded from: classes.dex */
final class C6403e implements InterfaceC6304e {

    /* JADX INFO: renamed from: a */
    private final CharSequence f24436a;

    /* JADX INFO: renamed from: b */
    private final int f24437b;

    /* JADX INFO: renamed from: c */
    private final int f24438c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5371p f24439d;

    /* JADX INFO: renamed from: m6.e$a */
    public static final class a implements Iterator, InterfaceC5442a {

        /* JADX INFO: renamed from: a */
        private int f24440a = -1;

        /* JADX INFO: renamed from: b */
        private int f24441b;

        /* JADX INFO: renamed from: c */
        private int f24442c;

        /* JADX INFO: renamed from: d */
        private C5904f f24443d;

        /* JADX INFO: renamed from: e */
        private int f24444e;

        a() {
            int iG = AbstractC5905g.m26659g(C6403e.this.f24437b, 0, C6403e.this.f24436a.length());
            this.f24441b = iG;
            this.f24442c = iG;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:12:0x0030 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x0097  */
        /* JADX INFO: renamed from: a */
        private final void m27526a() {
            C1435m c1435m;
            if (this.f24442c < 0) {
                this.f24440a = 0;
                this.f24443d = null;
                return;
            }
            if (C6403e.this.f24438c > 0) {
                int i7 = this.f24444e + 1;
                this.f24444e = i7;
                if (i7 >= C6403e.this.f24438c) {
                    this.f24443d = new C5904f(this.f24441b, AbstractC6420v.m27596U(C6403e.this.f24436a));
                    this.f24442c = -1;
                } else if (this.f24442c > C6403e.this.f24436a.length() && (c1435m = (C1435m) C6403e.this.f24439d.invoke(C6403e.this.f24436a, Integer.valueOf(this.f24442c))) != null) {
                    int iIntValue = ((Number) c1435m.m6068a()).intValue();
                    int iIntValue2 = ((Number) c1435m.m6069b()).intValue();
                    this.f24443d = AbstractC5905g.m26663k(this.f24441b, iIntValue);
                    int i8 = iIntValue + iIntValue2;
                    this.f24441b = i8;
                    this.f24442c = i8 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f24443d = new C5904f(this.f24441b, AbstractC6420v.m27596U(C6403e.this.f24436a));
                    this.f24442c = -1;
                }
            } else if (this.f24442c > C6403e.this.f24436a.length()) {
                this.f24443d = new C5904f(this.f24441b, AbstractC6420v.m27596U(C6403e.this.f24436a));
                this.f24442c = -1;
            } else {
                int iIntValue3 = ((Number) c1435m.m6068a()).intValue();
                int iIntValue4 = ((Number) c1435m.m6069b()).intValue();
                this.f24443d = AbstractC5905g.m26663k(this.f24441b, iIntValue3);
                int i9 = iIntValue3 + iIntValue4;
                this.f24441b = i9;
                this.f24442c = i9 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.f24440a = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5904f next() {
            if (this.f24440a == -1) {
                m27526a();
            }
            if (this.f24440a == 0) {
                throw new NoSuchElementException();
            }
            C5904f c5904f = this.f24443d;
            AbstractC6118n.m27185c(c5904f, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f24443d = null;
            this.f24440a = -1;
            return c5904f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24440a == -1) {
                m27526a();
            }
            return this.f24440a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6403e(CharSequence input, int i7, int i8, InterfaceC5371p getNextMatch) {
        AbstractC6118n.m27187e(input, "input");
        AbstractC6118n.m27187e(getNextMatch, "getNextMatch");
        this.f24436a = input;
        this.f24437b = i7;
        this.f24438c = i8;
        this.f24439d = getNextMatch;
    }

    @Override // p294l6.InterfaceC6304e
    public Iterator iterator() {
        return new a();
    }
}
