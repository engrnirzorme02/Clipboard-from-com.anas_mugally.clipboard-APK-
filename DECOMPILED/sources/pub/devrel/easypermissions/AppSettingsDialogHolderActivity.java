package pub.devrel.easypermissions;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AbstractActivityC2242c;
import androidx.appcompat.app.DialogInterfaceC2241b;

/* JADX INFO: loaded from: classes.dex */
public class AppSettingsDialogHolderActivity extends AbstractActivityC2242c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: O */
    private DialogInterfaceC2241b f27221O;

    /* JADX INFO: renamed from: P */
    private int f27222P;

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        setResult(i8, intent);
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i7) {
        if (i7 == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.f27222P);
            startActivityForResult(data, 7534);
        } else if (i7 == -2) {
            setResult(0);
            finish();
        } else {
            throw new IllegalStateException("Unknown button type: " + i7);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6780a c6780aM29617a = C6780a.m29617a(getIntent(), this);
        this.f27222P = c6780aM29617a.m29619b();
        this.f27221O = c6780aM29617a.m29620d(this, this);
    }

    @Override // androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        DialogInterfaceC2241b dialogInterfaceC2241b = this.f27221O;
        if (dialogInterfaceC2241b == null || !dialogInterfaceC2241b.isShowing()) {
            return;
        }
        this.f27221O.dismiss();
    }
}
