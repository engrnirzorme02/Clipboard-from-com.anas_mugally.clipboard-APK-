package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AbstractC2319Q;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p111O.AbstractC1030Z;
import p255h.AbstractC5520a;
import p255h.AbstractC5525f;
import p255h.AbstractC5529j;

/* JADX INFO: loaded from: classes.dex */
class AlertController {

    /* JADX INFO: renamed from: A */
    NestedScrollView f7211A;

    /* JADX INFO: renamed from: C */
    private Drawable f7213C;

    /* JADX INFO: renamed from: D */
    private ImageView f7214D;

    /* JADX INFO: renamed from: E */
    private TextView f7215E;

    /* JADX INFO: renamed from: F */
    private TextView f7216F;

    /* JADX INFO: renamed from: G */
    private View f7217G;

    /* JADX INFO: renamed from: H */
    ListAdapter f7218H;

    /* JADX INFO: renamed from: J */
    private int f7220J;

    /* JADX INFO: renamed from: K */
    private int f7221K;

    /* JADX INFO: renamed from: L */
    int f7222L;

    /* JADX INFO: renamed from: M */
    int f7223M;

    /* JADX INFO: renamed from: N */
    int f7224N;

    /* JADX INFO: renamed from: O */
    int f7225O;

    /* JADX INFO: renamed from: P */
    private boolean f7226P;

    /* JADX INFO: renamed from: R */
    Handler f7228R;

    /* JADX INFO: renamed from: a */
    private final Context f7230a;

    /* JADX INFO: renamed from: b */
    final DialogC2255p f7231b;

    /* JADX INFO: renamed from: c */
    private final Window f7232c;

    /* JADX INFO: renamed from: d */
    private final int f7233d;

    /* JADX INFO: renamed from: e */
    private CharSequence f7234e;

    /* JADX INFO: renamed from: f */
    private CharSequence f7235f;

    /* JADX INFO: renamed from: g */
    ListView f7236g;

    /* JADX INFO: renamed from: h */
    private View f7237h;

    /* JADX INFO: renamed from: i */
    private int f7238i;

    /* JADX INFO: renamed from: j */
    private int f7239j;

    /* JADX INFO: renamed from: k */
    private int f7240k;

    /* JADX INFO: renamed from: l */
    private int f7241l;

    /* JADX INFO: renamed from: m */
    private int f7242m;

    /* JADX INFO: renamed from: o */
    Button f7244o;

    /* JADX INFO: renamed from: p */
    private CharSequence f7245p;

    /* JADX INFO: renamed from: q */
    Message f7246q;

    /* JADX INFO: renamed from: r */
    private Drawable f7247r;

    /* JADX INFO: renamed from: s */
    Button f7248s;

    /* JADX INFO: renamed from: t */
    private CharSequence f7249t;

    /* JADX INFO: renamed from: u */
    Message f7250u;

    /* JADX INFO: renamed from: v */
    private Drawable f7251v;

    /* JADX INFO: renamed from: w */
    Button f7252w;

    /* JADX INFO: renamed from: x */
    private CharSequence f7253x;

    /* JADX INFO: renamed from: y */
    Message f7254y;

    /* JADX INFO: renamed from: z */
    private Drawable f7255z;

    /* JADX INFO: renamed from: n */
    private boolean f7243n = false;

    /* JADX INFO: renamed from: B */
    private int f7212B = 0;

    /* JADX INFO: renamed from: I */
    int f7219I = -1;

    /* JADX INFO: renamed from: Q */
    private int f7227Q = 0;

    /* JADX INFO: renamed from: S */
    private final View.OnClickListener f7229S = new ViewOnClickListenerC2236a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a */
        private final int f7256a;

        /* JADX INFO: renamed from: b */
        private final int f7257b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5529j.f21238c2);
            this.f7257b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5529j.f21243d2, -1);
            this.f7256a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5529j.f21248e2, -1);
        }

        /* JADX INFO: renamed from: a */
        public void m9077a(boolean z7, boolean z8) {
            if (z8 && z7) {
                return;
            }
            setPadding(getPaddingLeft(), z7 ? getPaddingTop() : this.f7256a, getPaddingRight(), z8 ? getPaddingBottom() : this.f7257b);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$a */
    class ViewOnClickListenerC2236a implements View.OnClickListener {
        ViewOnClickListenerC2236a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f7244o && (message3 = alertController.f7246q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f7248s || (message2 = alertController.f7250u) == null) {
                messageObtain = (view != alertController.f7252w || (message = alertController.f7254y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f7228R.obtainMessage(1, alertController2.f7231b).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b */
    public static class C2237b {

        /* JADX INFO: renamed from: A */
        public int f7259A;

        /* JADX INFO: renamed from: B */
        public int f7260B;

        /* JADX INFO: renamed from: C */
        public int f7261C;

        /* JADX INFO: renamed from: D */
        public int f7262D;

        /* JADX INFO: renamed from: F */
        public boolean[] f7264F;

        /* JADX INFO: renamed from: G */
        public boolean f7265G;

        /* JADX INFO: renamed from: H */
        public boolean f7266H;

        /* JADX INFO: renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f7268J;

        /* JADX INFO: renamed from: K */
        public Cursor f7269K;

        /* JADX INFO: renamed from: L */
        public String f7270L;

        /* JADX INFO: renamed from: M */
        public String f7271M;

        /* JADX INFO: renamed from: N */
        public AdapterView.OnItemSelectedListener f7272N;

        /* JADX INFO: renamed from: a */
        public final Context f7274a;

        /* JADX INFO: renamed from: b */
        public final LayoutInflater f7275b;

        /* JADX INFO: renamed from: d */
        public Drawable f7277d;

        /* JADX INFO: renamed from: f */
        public CharSequence f7279f;

        /* JADX INFO: renamed from: g */
        public View f7280g;

        /* JADX INFO: renamed from: h */
        public CharSequence f7281h;

        /* JADX INFO: renamed from: i */
        public CharSequence f7282i;

        /* JADX INFO: renamed from: j */
        public Drawable f7283j;

        /* JADX INFO: renamed from: k */
        public DialogInterface.OnClickListener f7284k;

        /* JADX INFO: renamed from: l */
        public CharSequence f7285l;

        /* JADX INFO: renamed from: m */
        public Drawable f7286m;

        /* JADX INFO: renamed from: n */
        public DialogInterface.OnClickListener f7287n;

        /* JADX INFO: renamed from: o */
        public CharSequence f7288o;

        /* JADX INFO: renamed from: p */
        public Drawable f7289p;

        /* JADX INFO: renamed from: q */
        public DialogInterface.OnClickListener f7290q;

        /* JADX INFO: renamed from: s */
        public DialogInterface.OnCancelListener f7292s;

        /* JADX INFO: renamed from: t */
        public DialogInterface.OnDismissListener f7293t;

        /* JADX INFO: renamed from: u */
        public DialogInterface.OnKeyListener f7294u;

        /* JADX INFO: renamed from: v */
        public CharSequence[] f7295v;

        /* JADX INFO: renamed from: w */
        public ListAdapter f7296w;

        /* JADX INFO: renamed from: x */
        public DialogInterface.OnClickListener f7297x;

        /* JADX INFO: renamed from: y */
        public int f7298y;

        /* JADX INFO: renamed from: z */
        public View f7299z;

        /* JADX INFO: renamed from: c */
        public int f7276c = 0;

        /* JADX INFO: renamed from: e */
        public int f7278e = 0;

        /* JADX INFO: renamed from: E */
        public boolean f7263E = false;

        /* JADX INFO: renamed from: I */
        public int f7267I = -1;

        /* JADX INFO: renamed from: O */
        public boolean f7273O = true;

        /* JADX INFO: renamed from: r */
        public boolean f7291r = true;

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$a */
        class a extends ArrayAdapter {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ RecycleListView f7300a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i7, int i8, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i7, i8, charSequenceArr);
                this.f7300a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i7, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i7, view, viewGroup);
                boolean[] zArr = C2237b.this.f7264F;
                if (zArr != null && zArr[i7]) {
                    this.f7300a.setItemChecked(i7, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b */
        class b extends CursorAdapter {

            /* JADX INFO: renamed from: a */
            private final int f7302a;

            /* JADX INFO: renamed from: b */
            private final int f7303b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ RecycleListView f7304c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ AlertController f7305d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z7, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z7);
                this.f7304c = recycleListView;
                this.f7305d = alertController;
                Cursor cursor2 = getCursor();
                this.f7302a = cursor2.getColumnIndexOrThrow(C2237b.this.f7270L);
                this.f7303b = cursor2.getColumnIndexOrThrow(C2237b.this.f7271M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f7302a));
                this.f7304c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f7303b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C2237b.this.f7275b.inflate(this.f7305d.f7223M, viewGroup, false);
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$c */
        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AlertController f7307a;

            c(AlertController alertController) {
                this.f7307a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
                C2237b.this.f7297x.onClick(this.f7307a.f7231b, i7);
                if (C2237b.this.f7266H) {
                    return;
                }
                this.f7307a.f7231b.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$d */
        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ RecycleListView f7309a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AlertController f7310b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f7309a = recycleListView;
                this.f7310b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
                boolean[] zArr = C2237b.this.f7264F;
                if (zArr != null) {
                    zArr[i7] = this.f7309a.isItemChecked(i7);
                }
                C2237b.this.f7268J.onClick(this.f7310b.f7231b, i7, this.f7309a.isItemChecked(i7));
            }
        }

        public C2237b(Context context) {
            this.f7274a = context;
            this.f7275b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX INFO: renamed from: b */
        private void m9078b(AlertController alertController) {
            C2237b c2237b;
            AlertController alertController2;
            ListAdapter c2239d;
            RecycleListView recycleListView = (RecycleListView) this.f7275b.inflate(alertController.f7222L, (ViewGroup) null);
            if (!this.f7265G) {
                c2237b = this;
                alertController2 = alertController;
                int i7 = c2237b.f7266H ? alertController2.f7224N : alertController2.f7225O;
                if (c2237b.f7269K != null) {
                    c2239d = new SimpleCursorAdapter(c2237b.f7274a, i7, c2237b.f7269K, new String[]{c2237b.f7270L}, new int[]{R.id.text1});
                } else {
                    c2239d = c2237b.f7296w;
                    if (c2239d == null) {
                        c2239d = new C2239d(c2237b.f7274a, i7, R.id.text1, c2237b.f7295v);
                    }
                }
            } else if (this.f7269K == null) {
                c2237b = this;
                c2239d = c2237b.new a(this.f7274a, alertController.f7223M, R.id.text1, this.f7295v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                c2237b = this;
                alertController2 = alertController;
                c2239d = c2237b.new b(c2237b.f7274a, c2237b.f7269K, false, recycleListView, alertController2);
            }
            alertController2.f7218H = c2239d;
            alertController2.f7219I = c2237b.f7267I;
            if (c2237b.f7297x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (c2237b.f7268J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = c2237b.f7272N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (c2237b.f7266H) {
                recycleListView.setChoiceMode(1);
            } else if (c2237b.f7265G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f7236g = recycleListView;
        }

        /* JADX INFO: renamed from: a */
        public void m9079a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f7280g;
            if (view != null) {
                alertController.m9069k(view);
            } else {
                CharSequence charSequence = this.f7279f;
                if (charSequence != null) {
                    alertController.m9073p(charSequence);
                }
                Drawable drawable = this.f7277d;
                if (drawable != null) {
                    alertController.m9071m(drawable);
                }
                int i7 = this.f7276c;
                if (i7 != 0) {
                    alertController.m9070l(i7);
                }
                int i8 = this.f7278e;
                if (i8 != 0) {
                    alertController.m9070l(alertController.m9063c(i8));
                }
            }
            CharSequence charSequence2 = this.f7281h;
            if (charSequence2 != null) {
                alertController.m9072n(charSequence2);
            }
            CharSequence charSequence3 = this.f7282i;
            if (charSequence3 == null && this.f7283j == null) {
                alertController2 = alertController;
            } else {
                alertController.m9068j(-1, charSequence3, this.f7284k, null, this.f7283j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f7285l;
            if (charSequence4 != null || this.f7286m != null) {
                alertController2.m9068j(-2, charSequence4, this.f7287n, null, this.f7286m);
            }
            CharSequence charSequence5 = this.f7288o;
            if (charSequence5 != null || this.f7289p != null) {
                alertController2.m9068j(-3, charSequence5, this.f7290q, null, this.f7289p);
            }
            if (this.f7295v != null || this.f7269K != null || this.f7296w != null) {
                m9078b(alertController2);
            }
            View view2 = this.f7299z;
            if (view2 != null) {
                if (this.f7263E) {
                    alertController2.m9076s(view2, this.f7259A, this.f7260B, this.f7261C, this.f7262D);
                    return;
                } else {
                    alertController2.m9075r(view2);
                    return;
                }
            }
            int i9 = this.f7298y;
            if (i9 != 0) {
                alertController2.m9074q(i9);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$c */
    private static final class HandlerC2238c extends Handler {

        /* JADX INFO: renamed from: a */
        private WeakReference f7312a;

        public HandlerC2238c(DialogInterface dialogInterface) {
            this.f7312a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == -3 || i7 == -2 || i7 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f7312a.get(), message.what);
            } else {
                if (i7 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$d */
    private static class C2239d extends ArrayAdapter {
        public C2239d(Context context, int i7, int i8, CharSequence[] charSequenceArr) {
            super(context, i7, i8, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC2255p dialogC2255p, Window window) {
        this.f7230a = context;
        this.f7231b = dialogC2255p;
        this.f7232c = window;
        this.f7228R = new HandlerC2238c(dialogC2255p);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC5529j.f21139F, AbstractC5520a.f20973k, 0);
        this.f7220J = typedArrayObtainStyledAttributes.getResourceId(AbstractC5529j.f21144G, 0);
        this.f7221K = typedArrayObtainStyledAttributes.getResourceId(AbstractC5529j.f21153I, 0);
        this.f7222L = typedArrayObtainStyledAttributes.getResourceId(AbstractC5529j.f21161K, 0);
        this.f7223M = typedArrayObtainStyledAttributes.getResourceId(AbstractC5529j.f21165L, 0);
        this.f7224N = typedArrayObtainStyledAttributes.getResourceId(AbstractC5529j.f21173N, 0);
        this.f7225O = typedArrayObtainStyledAttributes.getResourceId(AbstractC5529j.f21157J, 0);
        this.f7226P = typedArrayObtainStyledAttributes.getBoolean(AbstractC5529j.f21169M, true);
        this.f7233d = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5529j.f21149H, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC2255p.m9287j(1);
    }

    /* JADX INFO: renamed from: a */
    static boolean m9052a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m9052a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private void m9053b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: h */
    private ViewGroup m9054h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: i */
    private int m9055i() {
        int i7 = this.f7221K;
        return (i7 != 0 && this.f7227Q == 1) ? i7 : this.f7220J;
    }

    /* JADX INFO: renamed from: o */
    private void m9056o(ViewGroup viewGroup, View view, int i7, int i8) {
        View viewFindViewById = this.f7232c.findViewById(AbstractC5525f.f21072t);
        View viewFindViewById2 = this.f7232c.findViewById(AbstractC5525f.f21071s);
        AbstractC1030Z.m4500w0(view, i7, i8);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    /* JADX INFO: renamed from: t */
    private void m9057t(ViewGroup viewGroup) {
        int i7;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f7244o = button;
        button.setOnClickListener(this.f7229S);
        if (TextUtils.isEmpty(this.f7245p) && this.f7247r == null) {
            this.f7244o.setVisibility(8);
            i7 = 0;
        } else {
            this.f7244o.setText(this.f7245p);
            Drawable drawable = this.f7247r;
            if (drawable != null) {
                int i8 = this.f7233d;
                drawable.setBounds(0, 0, i8, i8);
                this.f7244o.setCompoundDrawables(this.f7247r, null, null, null);
            }
            this.f7244o.setVisibility(0);
            i7 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f7248s = button2;
        button2.setOnClickListener(this.f7229S);
        if (TextUtils.isEmpty(this.f7249t) && this.f7251v == null) {
            this.f7248s.setVisibility(8);
        } else {
            this.f7248s.setText(this.f7249t);
            Drawable drawable2 = this.f7251v;
            if (drawable2 != null) {
                int i9 = this.f7233d;
                drawable2.setBounds(0, 0, i9, i9);
                this.f7248s.setCompoundDrawables(this.f7251v, null, null, null);
            }
            this.f7248s.setVisibility(0);
            i7 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f7252w = button3;
        button3.setOnClickListener(this.f7229S);
        if (TextUtils.isEmpty(this.f7253x) && this.f7255z == null) {
            this.f7252w.setVisibility(8);
        } else {
            this.f7252w.setText(this.f7253x);
            Drawable drawable3 = this.f7255z;
            if (drawable3 != null) {
                int i10 = this.f7233d;
                drawable3.setBounds(0, 0, i10, i10);
                this.f7252w.setCompoundDrawables(this.f7255z, null, null, null);
            }
            this.f7252w.setVisibility(0);
            i7 |= 4;
        }
        if (m9062y(this.f7230a)) {
            if (i7 == 1) {
                m9053b(this.f7244o);
            } else if (i7 == 2) {
                m9053b(this.f7248s);
            } else if (i7 == 4) {
                m9053b(this.f7252w);
            }
        }
        if (i7 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* JADX INFO: renamed from: u */
    private void m9058u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f7232c.findViewById(AbstractC5525f.f21073u);
        this.f7211A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f7211A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f7216F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f7235f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f7211A.removeView(this.f7216F);
        if (this.f7236g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f7211A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f7211A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f7236g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: v */
    private void m9059v(ViewGroup viewGroup) {
        View viewInflate = this.f7237h;
        if (viewInflate == null) {
            viewInflate = this.f7238i != 0 ? LayoutInflater.from(this.f7230a).inflate(this.f7238i, viewGroup, false) : null;
        }
        boolean z7 = viewInflate != null;
        if (!z7 || !m9052a(viewInflate)) {
            this.f7232c.setFlags(131072, 131072);
        }
        if (!z7) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f7232c.findViewById(AbstractC5525f.f21066n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f7243n) {
            frameLayout.setPadding(this.f7239j, this.f7240k, this.f7241l, this.f7242m);
        }
        if (this.f7236g != null) {
            ((LinearLayout.LayoutParams) ((AbstractC2319Q.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    /* JADX INFO: renamed from: w */
    private void m9060w(ViewGroup viewGroup) {
        if (this.f7217G != null) {
            viewGroup.addView(this.f7217G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f7232c.findViewById(AbstractC5525f.f21051D).setVisibility(8);
            return;
        }
        this.f7214D = (ImageView) this.f7232c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f7234e) || !this.f7226P) {
            this.f7232c.findViewById(AbstractC5525f.f21051D).setVisibility(8);
            this.f7214D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f7232c.findViewById(AbstractC5525f.f21062j);
        this.f7215E = textView;
        textView.setText(this.f7234e);
        int i7 = this.f7212B;
        if (i7 != 0) {
            this.f7214D.setImageResource(i7);
            return;
        }
        Drawable drawable = this.f7213C;
        if (drawable != null) {
            this.f7214D.setImageDrawable(drawable);
        } else {
            this.f7215E.setPadding(this.f7214D.getPaddingLeft(), this.f7214D.getPaddingTop(), this.f7214D.getPaddingRight(), this.f7214D.getPaddingBottom());
            this.f7214D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    private void m9061x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f7232c.findViewById(AbstractC5525f.f21070r);
        int i7 = AbstractC5525f.f21052E;
        View viewFindViewById4 = viewFindViewById3.findViewById(i7);
        int i8 = AbstractC5525f.f21065m;
        View viewFindViewById5 = viewFindViewById3.findViewById(i8);
        int i9 = AbstractC5525f.f21063k;
        View viewFindViewById6 = viewFindViewById3.findViewById(i9);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(AbstractC5525f.f21067o);
        m9059v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i7);
        View viewFindViewById8 = viewGroup.findViewById(i8);
        View viewFindViewById9 = viewGroup.findViewById(i9);
        ViewGroup viewGroupM9054h = m9054h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM9054h2 = m9054h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupM9054h3 = m9054h(viewFindViewById9, viewFindViewById6);
        m9058u(viewGroupM9054h2);
        m9057t(viewGroupM9054h3);
        m9060w(viewGroupM9054h);
        boolean z7 = viewGroup.getVisibility() != 8;
        boolean z8 = (viewGroupM9054h == null || viewGroupM9054h.getVisibility() == 8) ? 0 : 1;
        boolean z9 = (viewGroupM9054h3 == null || viewGroupM9054h3.getVisibility() == 8) ? false : true;
        if (!z9 && viewGroupM9054h2 != null && (viewFindViewById2 = viewGroupM9054h2.findViewById(AbstractC5525f.f21078z)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z8 != 0) {
            NestedScrollView nestedScrollView = this.f7211A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f7235f == null && this.f7236g == null) ? null : viewGroupM9054h.findViewById(AbstractC5525f.f21050C);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupM9054h2 != null && (viewFindViewById = viewGroupM9054h2.findViewById(AbstractC5525f.f21048A)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f7236g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m9077a(z8, z9);
        }
        if (!z7) {
            View view = this.f7236g;
            if (view == null) {
                view = this.f7211A;
            }
            if (view != null) {
                m9056o(viewGroupM9054h2, view, z8 | (z9 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f7236g;
        if (listView2 == null || (listAdapter = this.f7218H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i10 = this.f7219I;
        if (i10 > -1) {
            listView2.setItemChecked(i10, true);
            listView2.setSelection(i10);
        }
    }

    /* JADX INFO: renamed from: y */
    private static boolean m9062y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5520a.f20972j, typedValue, true);
        return typedValue.data != 0;
    }

    /* JADX INFO: renamed from: c */
    public int m9063c(int i7) {
        TypedValue typedValue = new TypedValue();
        this.f7230a.getTheme().resolveAttribute(i7, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: d */
    public ListView m9064d() {
        return this.f7236g;
    }

    /* JADX INFO: renamed from: e */
    public void m9065e() {
        this.f7231b.setContentView(m9055i());
        m9061x();
    }

    /* JADX INFO: renamed from: f */
    public boolean m9066f(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f7211A;
        return nestedScrollView != null && nestedScrollView.m10669t(keyEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean m9067g(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f7211A;
        return nestedScrollView != null && nestedScrollView.m10669t(keyEvent);
    }

    /* JADX INFO: renamed from: j */
    public void m9068j(int i7, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f7228R.obtainMessage(i7, onClickListener);
        }
        if (i7 == -3) {
            this.f7253x = charSequence;
            this.f7254y = message;
            this.f7255z = drawable;
        } else if (i7 == -2) {
            this.f7249t = charSequence;
            this.f7250u = message;
            this.f7251v = drawable;
        } else {
            if (i7 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f7245p = charSequence;
            this.f7246q = message;
            this.f7247r = drawable;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m9069k(View view) {
        this.f7217G = view;
    }

    /* JADX INFO: renamed from: l */
    public void m9070l(int i7) {
        this.f7213C = null;
        this.f7212B = i7;
        ImageView imageView = this.f7214D;
        if (imageView != null) {
            if (i7 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f7214D.setImageResource(this.f7212B);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m9071m(Drawable drawable) {
        this.f7213C = drawable;
        this.f7212B = 0;
        ImageView imageView = this.f7214D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f7214D.setImageDrawable(drawable);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m9072n(CharSequence charSequence) {
        this.f7235f = charSequence;
        TextView textView = this.f7216F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m9073p(CharSequence charSequence) {
        this.f7234e = charSequence;
        TextView textView = this.f7215E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m9074q(int i7) {
        this.f7237h = null;
        this.f7238i = i7;
        this.f7243n = false;
    }

    /* JADX INFO: renamed from: r */
    public void m9075r(View view) {
        this.f7237h = view;
        this.f7238i = 0;
        this.f7243n = false;
    }

    /* JADX INFO: renamed from: s */
    public void m9076s(View view, int i7, int i8, int i9, int i10) {
        this.f7237h = view;
        this.f7238i = 0;
        this.f7243n = true;
        this.f7239j = i7;
        this.f7240k = i8;
        this.f7241l = i9;
        this.f7242m = i10;
    }
}
