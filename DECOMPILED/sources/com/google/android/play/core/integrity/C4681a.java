package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.a */
/* JADX INFO: loaded from: classes2.dex */
final class C4681a extends AbstractC4697ap {

    /* JADX INFO: renamed from: a */
    private String f18233a;

    /* JADX INFO: renamed from: b */
    private AbstractC4755y f18234b;

    C4681a() {
    }

    @Override // com.google.android.play.core.integrity.AbstractC4697ap
    /* JADX INFO: renamed from: a */
    final AbstractC4697ap mo21827a(AbstractC4755y abstractC4755y) {
        this.f18234b = abstractC4755y;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC4697ap
    /* JADX INFO: renamed from: b */
    final AbstractC4697ap mo21828b(String str) {
        this.f18233a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC4697ap
    /* JADX INFO: renamed from: c */
    final C4698aq mo21829c() {
        AbstractC4755y abstractC4755y;
        String str = this.f18233a;
        if (str != null && (abstractC4755y = this.f18234b) != null) {
            return new C4698aq(str, abstractC4755y);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f18233a == null) {
            sb.append(" token");
        }
        if (this.f18234b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
