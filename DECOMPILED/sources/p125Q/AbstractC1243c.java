package p125Q;

import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p104N.AbstractC0905b;
import p104N.AbstractC0910g;
import p111O.AbstractC1030Z;
import p111O.C1041d;

/* JADX INFO: renamed from: Q.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1243c {

    /* JADX INFO: renamed from: Q.c$a */
    class a extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ b f4453a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z7, b bVar) {
            super(inputConnection, z7);
            this.f4453a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
            if (this.f4453a.mo5474a(C1244d.m5479f(inputContentInfo), i7, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i7, bundle);
        }
    }

    /* JADX INFO: renamed from: Q.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo5474a(C1244d c1244d, int i7, Bundle bundle);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m5475a(View view, C1244d c1244d, int i7, Bundle bundle) {
        if ((i7 & 1) != 0) {
            try {
                c1244d.m5483d();
                Parcelable parcelable = (Parcelable) c1244d.m5484e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e7) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        return AbstractC1030Z.m4454Z(view, new C1041d.a(new ClipData(c1244d.m5481b(), new ClipData.Item(c1244d.m5480a())), 2).m4647d(c1244d.m5482c()).m4645b(bundle).m4644a()) == null;
    }

    /* JADX INFO: renamed from: b */
    private static b m5476b(final View view) {
        AbstractC0910g.m4139g(view);
        return new b() { // from class: Q.b
            @Override // p125Q.AbstractC1243c.b
            /* JADX INFO: renamed from: a */
            public final boolean mo5474a(C1244d c1244d, int i7, Bundle bundle) {
                return AbstractC1243c.m5475a(view, c1244d, i7, bundle);
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public static InputConnection m5477c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m5478d(inputConnection, editorInfo, m5476b(view));
    }

    /* JADX INFO: renamed from: d */
    public static InputConnection m5478d(InputConnection inputConnection, EditorInfo editorInfo, b bVar) {
        AbstractC0905b.m4128d(inputConnection, "inputConnection must be non-null");
        AbstractC0905b.m4128d(editorInfo, "editorInfo must be non-null");
        AbstractC0905b.m4128d(bVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, bVar);
    }
}
