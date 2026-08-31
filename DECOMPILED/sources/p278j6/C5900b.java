package p278j6;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1637p;

/* JADX INFO: renamed from: j6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5900b extends AbstractC1637p {

    /* JADX INFO: renamed from: a */
    private final int f23466a;

    /* JADX INFO: renamed from: b */
    private final int f23467b;

    /* JADX INFO: renamed from: c */
    private boolean f23468c;

    /* JADX INFO: renamed from: d */
    private int f23469d;

    public C5900b(char c7, char c8, int i7) {
        this.f23466a = i7;
        this.f23467b = c8;
        boolean z7 = false;
        if (i7 <= 0 ? AbstractC6118n.m27188f(c7, c8) >= 0 : AbstractC6118n.m27188f(c7, c8) <= 0) {
            z7 = true;
        }
        this.f23468c = z7;
        this.f23469d = z7 ? c7 : c8;
    }

    @Override // p152T5.AbstractC1637p
    /* JADX INFO: renamed from: a */
    public char mo6755a() {
        int i7 = this.f23469d;
        if (i7 != this.f23467b) {
            this.f23469d = this.f23466a + i7;
        } else {
            if (!this.f23468c) {
                throw new NoSuchElementException();
            }
            this.f23468c = false;
        }
        return (char) i7;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23468c;
    }
}
