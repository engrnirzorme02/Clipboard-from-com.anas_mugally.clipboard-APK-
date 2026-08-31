package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.b */
/* JADX INFO: loaded from: classes2.dex */
final class C4708b extends AbstractC4725bq {

    /* JADX INFO: renamed from: a */
    private String f18286a;

    /* JADX INFO: renamed from: b */
    private AbstractC4755y f18287b;

    C4708b() {
    }

    @Override // com.google.android.play.core.integrity.AbstractC4725bq
    /* JADX INFO: renamed from: a */
    final AbstractC4725bq mo21852a(AbstractC4755y abstractC4755y) {
        this.f18287b = abstractC4755y;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC4725bq
    /* JADX INFO: renamed from: b */
    final AbstractC4725bq mo21853b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f18286a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC4725bq
    /* JADX INFO: renamed from: c */
    final C4726br mo21854c() {
        AbstractC4755y abstractC4755y;
        String str = this.f18286a;
        if (str != null && (abstractC4755y = this.f18287b) != null) {
            return new C4726br(str, abstractC4755y);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f18286a == null) {
            sb.append(" token");
        }
        if (this.f18287b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
