package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: androidx.appcompat.widget.z */
/* JADX INFO: loaded from: classes.dex */
final class C2377z {

    /* JADX INFO: renamed from: a */
    private TextView f8355a;

    /* JADX INFO: renamed from: b */
    private TextClassifier f8356b;

    /* JADX INFO: renamed from: androidx.appcompat.widget.z$a */
    private static final class a {
        /* JADX INFO: renamed from: a */
        static TextClassifier m10180a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    C2377z(TextView textView) {
        this.f8355a = (TextView) AbstractC0910g.m4139g(textView);
    }

    /* JADX INFO: renamed from: a */
    public TextClassifier m10178a() {
        TextClassifier textClassifier = this.f8356b;
        return textClassifier == null ? a.m10180a(this.f8355a) : textClassifier;
    }

    /* JADX INFO: renamed from: b */
    public void m10179b(TextClassifier textClassifier) {
        this.f8356b = textClassifier;
    }
}
