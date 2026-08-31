package p379w1;

import android.content.Intent;
import androidx.appcompat.app.AbstractActivityC2242c;
import com.anas_mugally.clipboard.p221ui.notes.BrowserNotesFullActivity;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: w1.Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7305Z {
    /* JADX INFO: renamed from: a */
    public static final void m32303a(AbstractActivityC2242c abstractActivityC2242c) {
        AbstractC6118n.m27187e(abstractActivityC2242c, "<this>");
        Intent intent = new Intent(abstractActivityC2242c, (Class<?>) BrowserNotesFullActivity.class);
        intent.addFlags(268566528);
        abstractActivityC2242c.startActivity(intent);
    }
}
