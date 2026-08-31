package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.s */
/* JADX INFO: loaded from: classes2.dex */
final class C4789s extends AbstractC4790t {

    /* JADX INFO: renamed from: a */
    private final int f18403a;

    /* JADX INFO: renamed from: b */
    private final long f18404b;

    C4789s(int i7, long j7) {
        this.f18403a = i7;
        this.f18404b = j7;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC4790t
    /* JADX INFO: renamed from: a */
    public final int mo21935a() {
        return this.f18403a;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC4790t
    /* JADX INFO: renamed from: b */
    public final long mo21936b() {
        return this.f18404b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4790t) {
            AbstractC4790t abstractC4790t = (AbstractC4790t) obj;
            if (this.f18403a == abstractC4790t.mo21935a() && this.f18404b == abstractC4790t.mo21936b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f18404b;
        return ((int) (j7 ^ (j7 >>> 32))) ^ ((this.f18403a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f18403a + ", eventTimestamp=" + this.f18404b + "}";
    }
}
