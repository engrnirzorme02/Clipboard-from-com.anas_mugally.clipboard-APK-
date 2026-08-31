package p031D5;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

/* JADX INFO: renamed from: D5.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0219b {

    /* JADX INFO: renamed from: D5.b$a */
    class a implements View.OnLongClickListener {
        a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return AbstractC0219b.m1106d(view, view.getContentDescription());
        }
    }

    /* JADX INFO: renamed from: D5.b$b */
    class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f933a;

        b(int i7) {
            this.f933a = i7;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return AbstractC0219b.m1106d(view, view.getContext().getString(this.f933a));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1104b(View view) {
        view.setOnLongClickListener(new a());
    }

    /* JADX INFO: renamed from: c */
    public static void m1105c(View view, int i7) {
        view.setOnLongClickListener(new b(i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static boolean m1106d(View view, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        int[] iArr = new int[2];
        Rect rect = new Rect();
        view.getLocationOnScreen(iArr);
        view.getWindowVisibleDisplayFrame(rect);
        Context context = view.getContext();
        int width = view.getWidth();
        int height = view.getHeight();
        int i7 = iArr[0] + (width / 2);
        int i8 = context.getResources().getDisplayMetrics().widthPixels;
        int i9 = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        Toast toastMakeText = Toast.makeText(context, charSequence, 0);
        int i10 = iArr[1];
        if (i10 < i9) {
            toastMakeText.setGravity(49, i7 - (i8 / 2), (i10 - rect.top) + height);
        } else {
            toastMakeText.setGravity(49, i7 - (i8 / 2), (i10 - rect.top) - i9);
        }
        toastMakeText.show();
        return true;
    }
}
