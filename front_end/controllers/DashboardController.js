//logics for SPA
initiateUI();

function initiateUI() {
    clearAll();
    $("#dashboardContent").css("display", "block");
    setTheLastView();
}

function saveLastView(clickedID) {
    switch (clickedID) {
        case "dashboardContent":
            localStorage.setItem("view", "HOME");
            break;
        case "customerContent":
            localStorage.setItem("view", "CUSTOMER");
            break;
        case "itemContent":
            localStorage.setItem("view", "ITEM");
            break;
        case "orderContent":
            localStorage.setItem("view", "ORDER");
            break;
        case "orderDetailContent":
            localStorage.setItem("view", "ORDERDETAILS");
            break;
        case "staffContent":
            localStorage.setItem("view", "STAFF");
            break;
        case "suppliersContent":
            localStorage.setItem("view", "SUPPLIERS");
            break;
        case "salesContent":
            localStorage.setItem("view", "SALES");
            break;
    }
}

function setTheLastView() {
    let view = localStorage.getItem("view");
    switch (view) {
        case "HOME":
            setView($("#dashboardContent"));
            break;
        case "ITEM":
            setView($("#itemContent"));
            break;
        case "CUSTOMER":
            setView($("#customerContent"));
            break;
        case "ORDER":
            setView($("#orderContent"));
            break;
        case "ORDERDETAILS":
            setView($("#orderDetailsContent"));
            break;
        case "STAFF":
            setView($("#staffContent"));
            break;
        case "SUPPLIERS":
            setView($("#suppliersContent"));
            break;
        case "SALES":
            setView($("#salesContent"));
            break;
        default:
            setView($("#dashboardContent"));
    }
}

function clearAll() {
    $("#dashboardContent,#customerContent,#itemContent,#orderContent,#orderDetailsContent,#staffContent,#suppliersContent,#salesContent").css('display', 'none');
}

function setView(viewOb) {
    clearAll();
    viewOb.css("display", "block");
    saveLastView(viewOb.get(0).id);
    console.log(viewOb.get(0).id);
}

//bind events
$("#lnkHome").click(function () {
    setView($("#dashboardContent"));
});

$("#lnkCustomer").click(function () {
    setView($("#customerContent"));
});

$("#lnkItem").click(function () {
    setView($("#itemContent"));
});

$("#lnkOrders").click(function () {
    setView($("#orderContent"));
});

$("#lnkOrderDetails").click(function () {
    setView($("#orderDetailsContent"));
});

$("#lnkStaff").click(function () {
    setView($("#staffContent"));
});

$("#lnkSuppliers").click(function () {
    setView($("#suppliersContent"));
});

$("#lnkSales").click(function () {
    setView($("#salesContent"));
});

//end of logics for SPA